#include <iostream>
using namespace std;
class clas{
  public:
  int a,b;
  void cal();
};
void clas::cal()
{
  cin>>a;
  cin>>b;
  cout<<"a = "<<a<<endl;
  cout<<"b = "<<b<<endl;
}
int main() 
{
   // Try out your code here
  clas s;
  s.cal();
    return 0;
}