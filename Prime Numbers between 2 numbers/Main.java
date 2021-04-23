#include<stdio.h>
int main()
{
    int i,j,flag=0;
    int n;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        flag=0;
        for(j=1;j<=n;j++)
        {
            if(i%j==0)
            {
                flag++;
            }
        }
        if(flag==2)
        {
            printf("%d ",i);
        }
    }
}