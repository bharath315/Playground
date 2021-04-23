
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j=2,o=2,a=2,n,u;
  cin>>n;
  if (n==1)
  {
    cout<<"0";
  } 
   else if (n==2)
   {
     cout<<"0";
      cout<<"2";
  }
  else 
  {
    cout<<"0"<<" ";
    cout<<a<<" ";
    
     for (i=3;i<=n;i++)
  {
      if( i%2!=0)
    {
       u=a*i;
       j=j+u;
       cout<<j<<" ";
        o++;
        if ( o!=n)
        { 
        j=j+u;
       cout<<j<<" ";
       o++;
        }   
      if (o==n)
        break;
      }   
       
  }
 }
}  
  