#include <iostream>
#include<algorithm>
using namespace std;
class timemachine
{
  public:
  int hour,min,sec;
  void print()
  {
    cout<<"Hours :"<<endl<<"Minutes :"<<endl<<"Seconds :"<<endl<<"Time after add: "<<hour<<":"<<min<<":"<<sec;
  }
};
int main() 
{
   // Try out your code here
    int h1,h2,m1,m2,s1,s2,m,s,i,j;
    cin>>h1>>m1>>s1>>h2>>m2>>s2;
    if((s1+s2)>60)
    {
      m2++;
      i=(60-(s1+s2));
    }
    if((s1+s2)<60)
       {
         i=abs(s1+s2);
       }
       if((m1+m2)>60)
       {
         h2++;
         j=(60-(m1+m2));
       }
       if((m1+m2)<60)
       j=abs(m1+m2);
       int h=h1+h2;
       timemachine p;
       cout<<"Enter time:"<<endl;
       cout<<"Hours :"<<endl;
       cout<<"Minutes :"<<endl;
       cout<<"Seconds :"<<endl;
       cout<<"Enter time:"<<endl;
       p.hour=h;
       p.min=abs(j);
       p.sec=abs(i);
       p.print();
       
       return 0;
}