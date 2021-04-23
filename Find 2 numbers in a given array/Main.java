#include<stdio.h>
int main()
{
    int i,n1,n2,flag1=-1,flag2=-1;
    int n;
    scanf("%d",&n);
    int a[100];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    scanf("%d %d",&n1,&n2);
    for(i=0;i<n;i++)
    {
        if((a[i]==n1)&&(flag1==-1))
        {
            flag1=i;
        }
        if((a[i]==n2)&&(flag2==-1))
        {
            flag2=i;
        }
    }
    printf("Element 1 index = %d\nElement 2 index = %d",flag1,flag2);
}