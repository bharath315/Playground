#include <iostream>
using namespace std;
class contruct
{
  public:
  int x;
  int y;
  int display(int i,int j){
  cout<<"p1.x = "<<i<<", "<<"p1.y = "<<j<<endl;
  cout<<"p2.x = "<<i<<", "<<"p2.y = "<<j;
}
  };


int main() 
{
  contruct p1,p2;
  p1.x=10;
  p1.y=15;
  p2.x=10;
  p2.y=15;
  p1.display(p1.x,p1.y);
    return 0;
}