#include<iostream>
int main()
{
  // Type your code here
  int size;
  std::cin>>size;
  int a[size];
  for(int i=0;i<size;i++)
  {
    std::cin>>a[i];
  }
  int n,count;
  std::cin>>n;
  //std::cout<<n;
  for (int i=0;i<size ; i++)
  {
    if( a[i]==n)
    {
      count=1;
      break;
    }
    else if ( a[i]!=n)
      count=0;
  }
  if(count==1)
  {
    std::cout<<"She passed her exam";    
  }
  else 
  {
    std::cout<<"She failed";
  }
} 