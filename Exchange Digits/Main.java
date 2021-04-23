def fun(b):
    from itertools import permutations
    a=[]
    comb=permutations(b)
    for i in list(comb):
        x=list(i)
        s=0
        for j in x:
            s=s+int(j)
            s=s*10
        a.append(int(s/10))
    return a
        
        
b,c=map(int,input().split())
b=list(str(b))
d=fun(b)
min1=2147483647
for i in d:
    if i>c:
        diff=i-c
        if diff<min1:
            min1=diff
            ans=i
if min1==2147483647:
    print("-1")
else:
    print(ans)
