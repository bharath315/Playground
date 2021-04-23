#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int low;
  int up;
  cin>>low>>up;
  int count=0,close=0;
  for(int i=low;i<=up;i++)
  {
    int h=i%10;
    int j=i/10;
    if(h!=j){
      count++;
      close=1;
    }
  }
  if(close==0)
   cout<<"No Unique Number";
  else if(close==1)
    cout<<count;
      
    return 0;
}