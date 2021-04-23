#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float x1,x2,x3,y1,y2,y3;
  float x4,y4;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  x4=(x1+x2+x3)/(3);
  y4=(y1+y2+y3)/(3);
  cout << setprecision(6)<<x4<<endl;
  cout << setprecision(6) << y4;
  //cout<<setpresicion(5)<<x4<<endl<<y4;
}