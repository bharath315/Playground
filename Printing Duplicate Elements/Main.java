#include<stdio.h>
int main()
{
    int i,j,count=0;
    int n;
    scanf("%d",&n);
    int a[100];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        count=0;
        for(j=i;j<n;j++)                /*printing the duplicate elements in c */
        {
            if((a[i]==a[j])&&(i!=j))
            {
                count=1;
                break;
            }
        }
        if(count==1)
        {
            printf("%d ",a[i]);
        }
    }
}