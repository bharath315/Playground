#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int p,y,r;
  float e,f,g,t;
  cin>>p;
  cin>>r;
  cin>>y;
  e=(p*r*y)/(100) ;
  f=e+p;
  g=(2*e)/100;
  t=f-g; 
  cout<<e<<endl<<f<<endl<<g<<endl<<t;
}
