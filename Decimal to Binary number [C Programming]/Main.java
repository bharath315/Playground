#include<stdio.h>
int dec_to_bin(int n)
{
  int r,bin=0,power=1;
   while(n!=0)
  {
    r=n%2;
     bin=bin+r*power;
     power=power*10;
     n=n/2;
  }
  return bin;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
