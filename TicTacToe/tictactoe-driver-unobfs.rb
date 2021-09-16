l=1-ARGV[0].ord%2
$><<"I am player #{l+1}
"
def c e,n=5;(0...n).map{e.gets};end
def d b;b.map{|a|a[2..-1].split(" ").map{|e|"xo:".index e}};end
class Numeric;def x;to_i+1;end;def k?;x==3;end;end
class Array;def a x;i(x).reject{|e|e==2};end;def<o;q o;end;def w;reject{|v|v.any?{|v|v<0||v>2}};end;def q(o,s=1);self.zip(o).map{|x,y|x+s*y};end;def>o;q o,-1;end;def-@;compact;end;def i x;map{|e|g(x,e)};end;end
def g x,(a,b);x[b][a]rescue nil;end
def Q*c;->x{c.find{|u|g(x,u)==2}};end
def F x,l;$A.select{|c|g(x,c)==2&&$D.count{|d|
[c>d,c>d>d].w.i(x).sort==[l,2]
}>=2};end

def W x,l,c;$D.find{|d|
j=[c<d,c>d,c<d<d,c>d>d].w.a(x)==[l,l];
# puts "j = #{j}"
# g(x,c<d)==l&&(g(x,c<d<d)==l||g(x,c>d)==l)
};end
$D=[[-1,-1],[-1,0],[-1,1],[0,-1],[0,1],[1,-1],[1,0],[1,1]]
r=[
  ->x{$A.find{|c|g(x,c)==2&&W(x,l,c)}}, #win
  ->x{$A.find{|c|g(x,c)==2&&W(x,1-l,c)}}, #block
  ->x{F(x,l).first}, # fork
  ->x{if(f=F(x,1-l)).size<=1;f[0];else;
    p "thonk"
    $A.find{|y|$D.find{|d|d.any?{|a|a==0}&&g(x,y<d<d)==l}}
    # todo: or... other possibilities
  end}, #TODO: fork block
  Q([1,1]), # center
  ->x{$C.find.with_index{|u,i|g(x,$C[i^1])==1-l&&g(x,u)==2}}, #opposite
  Q(*$C=[[0,0],[2,2],[0,2],[2,0]]), # empty corner
  Q([0,1],[1,0],[1,2],[2,1]), # empty side
  Q(*$A=[[0,0],[0,1],[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]]) # catch all
]
t=1

p "l-val: #{l}"

# xt = [[2, 2, 1],
      # [2, 0, 2],
      # [0, 2, 2]]
# p F xt, 0

# exit

IO.popen("python tictactoe.py","r+"){|e|
    # k,=c e,1
    loop {
        *_,y=q=c(e)
        v=d(q)[1..3]
        t = /'x'/ === y ? 0 : 1
        break puts(q) if /won/ === y
        if t!=l;
            puts q; e.puts STDIN.gets;
        else;
        
            res = r.map { |o| o[v] };
            puts res.map.with_index(1) { |o,i| "#{i}. #{o && "#{o.map(&:x)} -> #{g v,o}"}" }
            res = res.-@.first
            
            if res
                res = res.map(&:x)
                # puts "Chosen move: #{res}"
                e.puts res * " "
            else
                puts "idk"
            end        
        end
    }
}
puts "Simulation over."