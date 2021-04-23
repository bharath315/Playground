#include <iostream>
using namespace std;
class evenorodd
{
  private:
  int n;
  public:
  void cal();
  void print();
};
void evenorodd::cal()
{
  cin>>n;
  if(n%2==0)
    cout<<"EVEN";
  else
    cout<<"ODD";
}
  
int main() 
{
   evenorodd s;
  s.cal();
  
    return 0;
}