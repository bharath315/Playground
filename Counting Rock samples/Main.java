#include<iostream>
using namespace std;

int main()
{
  int N,count,up,down;
  int R;
  cin>>N;
    int a[N-1];
    cin>>R;
  for(int i=0;i<=N-1;i++)
  {
    cin>>a[i];
  }
  while(R--)
  {
    cin>>up;
    cin>>down;
   for(int i=0;i<=N-1;i++)
    {
      if( a[i]>=up && a[i]<=down)
      {
       count=count+1; 
      }      
    }
    cout<<count<<" ";
    count=0;
  }
  
    
  

  return 0;
}