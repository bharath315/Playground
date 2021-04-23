n=int(input())
n1=input()
n1=n1.split( )
l=[]
for i in range(0,len(n1)):
    l.append(n1[i])
for i in range(0,len(l)):
    l[i]=int(l[i])
for i in range(0,len(l)):
    if(l[i]==0):
        print("0",end=" ")
for i in range(0,len(l)):
    if(l[i]==1):
        print("1",end=" ")
