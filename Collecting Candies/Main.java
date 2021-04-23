t=int(input())
b=[]
for i in range(t):
    n=int(input())
    boxes=list(map(int,input().split()))[:n]
    a=[]
    l=len(boxes)-1
    for j in range(l):
        s=0
        boxes.sort()
        if len(boxes)>=2:
            min1=boxes[0]
            min2=boxes[1]
            s=min1+min2
            a.append(s)
            boxes[1]=s
            boxes=boxes[1:len(boxes)]
        else:
            a.append(boxes[0])
    b.append(sum(a))
for i in range(len(b)):
    print(b[i])

    

