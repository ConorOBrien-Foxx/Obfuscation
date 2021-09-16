$><<"I am player #{(l=1-ARGV[0].ord%2)+1}\n";def c e,n=5;(0...n).map{e.
gets}end;def d b;b.map{|a|a[2..-1].split(?\ ).map{|e|"xo:".index e}}end
class Numeric;def x;to_i+1;end;def k?;x==3end end;class Array;def a x=[
];i(x).reject{|e|e==2}end;def<o;q o;end;def w;reject{|v|v.any?{|v|v<0||
v>2}};end;def q(o,s=1);self.zip(o).map{|x,y|x+s*y};end;def>o;q o,-1;end
def-@;compact;end;def i x;map{|e|g x,e}end;alias U:find;end;def g x,(a,
b),q=nil;x[b][a]rescue p;end;def Q*c;->x{c.U{|u|g(x,u)==2}}end;def F x,
l;$A.select{|c|g(x,c)==2&&$D.count{|d|[c>d,c>d>d].w.i(x).sort==[l,2]}>=
2}end;def W x,l,c;$D.U{|d|[c<d,c>d,c<d<d,c>d>d].w.a(x)==[l,l]}end;$D=[[
-1,-1],[-1,0],[-1,1],[0,-1],[0,1],[1,-1],[1,0],[1,1]];r=[->x{$A.U{|c|g(
x,c)==2&&W(x,l,c)}},->x{$A.U{|c|g(x,c)==2&&W(x,1-l,c)}},->x{F(x,l)[0]},
->x{(f=F(x,1-l)).size<=1?f[0]:$A.U{|y|$D.U{|d|d.any?{|a|a==0}&&g(x,y<d<
d)==l}}},Q([1,1]),->x{$C.U.with_index{|u,i|g(x,$C[i^1])==1-l&&g(x,u)==2
}},Q(*$C=[[0,0],[2,2],[0,2],[2,0]]),Q([0,1],[1,0],[1,2],[2,1]),Q(*$A=[[
0,0],[0,t=1],[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]])];IO.popen("p"+
"yp.eotcatcit nohty".reverse,"r+"){|e,q=4|loop{*_,y=q=c(e);v=d(q)[1..3]
t=/'x'/===y ?0:1;break puts(q)if/won/===y;puts q if m=t!=l;e.puts !m ?r
.map{|o|o[v]}.-@.first&.map(&:x)*?\t:STDIN.gets}};puts"Simulation over"