#include <iostream>
#include<string>
using namespace std;
class name{
  public:
  string s;
  void display()
  {
    cout<<"I am "<<s;
  }
};
int main() 
{
   name p;
  string w;
  cin>>w;
  p.s=w;
  p.display();
    return 0;
}