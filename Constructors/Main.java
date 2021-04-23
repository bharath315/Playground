#include<iostream>
using namespace std;
class Box
{
  public:
  int employeeid;
  Box()
  {
    employeeid=5;
  }
  Box(int i)
  {
    employeeid=21;
  }
  void display()
  {
    cout<<"5";
  }
};
int main()
{
  Box p=Box(21);
  Box q;
  cout<<"Default Constructor called"<<endl<<"Employee id is : "<<q.employeeid<<endl;
  cout<<"Parametrized Constructor called"<<endl<<"Employee id is : "<<p.employeeid;
  return 0;
}
  