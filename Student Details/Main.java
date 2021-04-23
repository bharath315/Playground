#include <iostream>
using namespace std;
class student {
  public:
  string s;
  int i,j;
  float p;
  void print()
  {
    cout<<"Enter name:"<<endl<<"Enter roll number:"<<endl<<"Enter total marks outof 500:"<<endl;
    cout<<"Student details:"<<endl;
    cout<<"Name: "<<s<<endl;
    cout<<"Roll Number: "<<i<<endl;
    cout<<"Total: "<<j<<endl;
    p=((float)j*100)/(500);
    cout<<"Percentage: "<<p;
  }
};
int main() 
{
   string s;
  cin>>s;
  int o;
  cin>>o;
  int h;
  cin>>h;
  student s1;
  s1.s=s;
  s1.i=o;
  s1.j=h;
  s1.print();
   
    return 0;
}