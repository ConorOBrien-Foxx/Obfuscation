max_size = ARGV[0].nil? ? 60 : ARGV[0].to_i
puts STDIN
    .read
    .lines
    .map.with_index(1) { |x, i| "#{"#{i}:".ljust(5)} #{x}" }
    .select { |x| x.size > max_size }
