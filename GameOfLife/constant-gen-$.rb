require 'json'
pool = {
    0 => "$$$$.$$",
    1 => "$$$$.$$$$",
    10 => "$$$$.$$_$$",
    100 => "$$$$.$$_$_",
}
step = pool.keys
unary = [
    lambda { |x, xs| [x+1, "#{xs}.$()"] },
    lambda { |x, xs| [x-1, "#{xs}.$$$()"] },
    lambda { |x, xs| [x*x, "#{xs}.$$$$$(#{xs})"] },
]
binary = [
    lambda { |x, xs, y, ys| [x+y, "#{xs}.$$$$(#{ys})"] },
    lambda { |x, xs, y, ys| [[x-y,0].max, "#{xs}.$$$$$$(#{ys})"] },
    lambda { |x, xs, y, ys| [[y-x,0].max, "#{ys}.$$$$$$(#{xs})"] },
    lambda { |x, xs, y, ys| [x*y, "#{xs}.$$$$$(#{ys})"] },
    lambda { |x, xs, y, ys| [(x/y rescue -1), "#{xs}.$$$$$$$(#{ys})"] },
]

def add_to(pool, next_step, save, np, rep, save_out)
    if pool.has_key? np
        if pool[np].size > rep.size
            pool[np] = rep
        end
    else
        next_step << np
        pool[np] = rep
    end
    
    if save.include?(np)
        if save_out[np] == nil
            n = save_out.size
            name = "_" + n.to_s(2).rjust(6, "0").tr("01", "$_")
            save_out[np] = pool[np]
            pool[np] = name
        # elsif save_out[np].size > rep.size && !rep.include?(pool[np])
            # name = pool[np]
            # save_out[np] = rep
        end
    end
    
end

def pool_step(pool, step, unary, binary, save, save_out)
    next_step = []
    cur_keys = pool.keys
    step.each { |n|
        # unary ops
        unary.each { |fn|
            next if save.include?(n)
            np, rep = fn[n, pool[n]]
            next if np < 0
            add_to pool, next_step, save, np, rep, save_out
        }
        # binary ops
        binary.each { |fn|
            cur_keys.each { |m|
                next if save.include?(n) && save.include?(m)
                np, rep = fn[m, pool[m], n, pool[n]]
                next if np < 0
                add_to pool, next_step, save, np, rep, save_out
            }
        }
    }
    
    next_step
end

to_save = [
    46, 32, 79,
    74, 96, 50, 91, 72,
    204, 61, 127, 58, 39, 109, 41, 30, 94, 44, 85, 68, 23, 109, 45, 183, 33, 81, 52, 148, 307, 41, 25, 41, 180,
    32, 116, 101, 110, 111, 114, 115, 105, 121, 112,
    32, 32, 116, 101, 110, 111, 114, 115, 105, 121, 112, 80, 99, 117, 44, 97, 104, 103,
].sort.uniq
save_out = {}

until to_save.all? { |k, v| save_out[k] != nil }
    step = pool_step pool, step, unary, binary, to_save, save_out
end

final_save_out = {}
known_constants = []
i = 0
until save_out.empty?
    any_success = save_out.any? { |k, v|
        scanned = v.scan(/_[$_]{6}/)
        success = scanned.all? { |pat| pat == k || known_constants.include?(pat) }
        if success
            final_save_out[k] = v
            known_constants << pool[k]
            save_out.delete k
        end
        success
    }
    
    break unless any_success
end

print "$$$$ "
first = true
(final_save_out.to_a + save_out.to_a).each { |k, v|
    unless first
        puts ","
    end
    first = false
    print "#{pool[k]}=#{final_save_out[k] || save_out[k]}"
    print " /*#{k}*/"
}
puts ";"
