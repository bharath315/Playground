#include <iostream>
#include<string>
using namespace std;
class function{
  public:
  string s;
  int n;
  void display()
  {
     cout<<"Student is: "<<s<<endl;
    cout<<"Student id is: "<<n;
  }
};

int main() 
{
   function p;
  string a;
  cin>>a;
  int k;
  cin>>k;
  p.s=a;
  p.n=k;
  p.display();
  
    return 0;
}