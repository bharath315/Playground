#include <iostream>
using namespace std;
bool is_prime(int n)
{
 
    if (n <= 1) 
        return false; 
    for (int i = 2; i < n; i++) 
        if (n % i == 0) 
            return false; 
  
    return true; 
}

int main() 
{
  int low,up;
  cin>>low>>up;
  int count=0;
  for(int i=low;i<up;i++)
  {
    if(is_prime(i))
    {
      if(is_prime(i+6) && i+6<=up)
      {
        //cout<<i<<" ";
        count++;
      }
    }
  }
  if(count>0)
  cout<<count;
  if(count==0)
    cout<<"No Prime Pairs";

    return 0;
}