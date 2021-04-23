#include<iostream>
using namespace std;
int base(int x,int y)
{
  if(x>0)
  {
      return (x%y+(10*base(x/y,y)));
  }
                   
}
int main()
{
  //Type your code here.
  int n,b;
  cin>>n>>b;
  cout<<"Enter the value of n"<<endl;
  cout<<"Enter the base to which you want to convert"<<endl;
  cout<<"The number in base "<<b<<" is "<<base(n,b);
  //cout<<base(n,b);
    
}