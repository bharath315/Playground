#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,rev=0,r=0;
  cin>>n;
  while (n !=0)
  {
    rev=rev*10+n%10;
    n=n/10;
  }
  n=rev;
  int c=1,se=0,so=0;
  while (n!=0)
  {
    if (c%2==0)
    {
      se=se+n%10;
    }
    else
    {
      so=so+n%10;
    }
    c++;
    n/=10;
  } 
    if ( se==so)
      cout<<"Yes";
    else if ( se!= so)
      cout<<"No";
    
   
}  