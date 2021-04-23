#include <iostream>
using namespace std;

int main() 
{
  int B,N,count,check=0;
  cin>>B;
  cin>>N;
  int Z[N-1];
  for(int  i=0;i<=N;i++)
  {
    cin>>Z[i];
  }
  for(int  i=0;i<=N-1;i++)
    B=B- ((Z[i]%2)+ (Z[i]/2));
 if(B<0)
   cout<<"NO";
 else
   cout<<"YES";
  
  
      return 0;
}
