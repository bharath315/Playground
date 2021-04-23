#include<stdio.h>
int dec_to_bin(int n)
{
   int t,i=0;
  t=n;
  while(t>0)
  {
    t=t/2;
    i++;
  }
  return i;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
