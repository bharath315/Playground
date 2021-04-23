n=input()
n=n.split( )
n1=int(n[0])
n2=int(n[1])
if(n1>n2):
  max=n1
else:
  max=n2
while(True):
  if((max%n1==0)and(max%n2==0)):
    print(max)
    break
  max=max+1