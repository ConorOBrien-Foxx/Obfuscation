(Y:=range(9),E:=lambda*a:lambda f:f(*a),P:=lambda g:[print(" ",*Y[-8:
4]),*(print(1+x//3,*("xo:"[j]for j in g[x:x+3]))for x in Z[-33:3])],C
:=lambda g:[E for E in[0,1]if any([all(t==E for t in h)for h in[[*map
(lambda u:g[int(u)],"".join(str(ord(c))for c in'CP0"2$x)H:*<')[x:x+3]
)]for x in Z]])]or all(2!=k for k in g),A:=lambda g,i,v=~4:(G:=g[(I:=
i[0]+3*i[1]-4)],[v if(v+5)*(not u-I)else g[u]for u in g[-1]]+[g[-1]])
[~v<0],Z:=[_*3for _ in Y[0:-1]],f:=lambda g,n:print(["Player %s '%s'"
+" %s: "][False]%(n," xo"[n],"(space-separated x y like 2 1) "*(1-any
(2-x for x in g[:-1]))))or(*(int(x)for x in input().split()),n^3),L:=
lambda n,g:not[*map(E(g),[P,C])][~0]and(F:=f(g,n),(len(F)<3or any(q<1
or q>3for q in F[0:2])or A(g,F[0:2])-2)and L(n,g)or L(F[2],A(g,F[0:2]
,~-n)))[-1]or print("%s has won."%["No one","Player %s"%(3^n)][True!=
C(g)])or 1)[-1](1,[2for _ in Y]+[[*Y]])