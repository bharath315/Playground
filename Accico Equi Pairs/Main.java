n=int(input())
x=n
array=list(map(int,input().split()))
c=0
l3=[0,0]
for a in range(0,n-2):
    for b in range(a+2,n):
        if sum(array[0:a]) == sum(array[a+1:b]):
            if sum(array[a+1:b])==sum(array[b+1:n]):
                c+=1
                print("Indices which form equi pair {%d,%d}"%(a,b))
                print("Slices are {0,%d},{%d,%d},{%d,%d}" %(a-1,a+1,b-1,b+1,n-1))
if c==0:
    print("Array does not contain any equi pair")
