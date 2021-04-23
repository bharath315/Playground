#include<iostream>
using namespace std;
int nofway(int cc,int cr,int r,int c)
{
  if(cr>r || cc>c)
    return 0;
  if(cr==r || cc==c)
    return 1;
  return nofway(cc,cr+1,r,c)+nofway(cc+1,cr,r,c);
}
int main ()
{
  int m,n;
  cin>>m>>n;
  cout<<nofway(0,0,m-1,n-1);
  return 0;
}