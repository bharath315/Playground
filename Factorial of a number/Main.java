#include<iostream>
int main(){
  // Type your code here
  int f=1,n,i;
   std::cin>>n;
  if (n!=0) 
  { 
    for (i=1;i<=n;i++)
    {
      f=f*i;
    }
     std::cout<<f;
  }  
  else
    std::cout<<"1";
}