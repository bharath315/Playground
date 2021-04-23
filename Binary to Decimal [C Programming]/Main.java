#include<stdio.h>
int bin_to_dec(int n)
{
  int i=0,dec=0,r;
    while(n!=0)
    {
      r=n%10;
      dec=dec+(r*pow(2,i));
      i++;
      n=n/10;
    }
  return dec;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}