#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,b;
  cin>>n;
  b=n;
  while (n != 0)
    {
        i = i + n % 10;
        n = n / 10;
    }
  if(b%i==0)
    cout<<"Harshad Number";
  else 
    cout<<"Not Harshad Number";
  
    
              
}