loan=int(input())
years=int(input())
slabs1=int(input())
s1,s2=0,0
for i in range(slabs1):
    y1,rate1=map(float,input().split())
    emi1=loan*rate1/(1-1/pow((1+rate1),(y1*12)))
    s1=s1+emi1
slabs2=int(input())
for i in range(slabs2):
    y2,rate2=map(float,input().split())
    emi2=loan*rate2/(1-1/pow((1+rate2),(y2*12)))
    s2=s2+emi2
if emi1<emi2:
    print("Bank A")
else:
    print("Bank B")
   
    
