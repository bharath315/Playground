#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int *ptr,n,k=0,o=0;
  std::cin>>n;
  ptr=(int *) malloc(n*sizeof(int));
  
  for ( int i=0;i<=n;i++)
  {
    std::cin>>*(ptr+i);
  }
  for (int i=0;i<n;i++)
  {
    if (*(ptr+i)%2==0)
    {
      k++;
    }
    else if (*(ptr+i)%2!=0)
      o++;
  }
  std::cout<<o<<'\n'<<k;
  
  return 0;
}