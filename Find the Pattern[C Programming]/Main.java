#include<stdio.h>
int pattern(int n)
{
   int i,j;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if((i==0)||(i==n-1)||(j==0)||(j==n-1))
      {
        printf("1");
      }
      else
      {
        printf(" ");
      }
    }
    printf("\n");
  }
}
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
