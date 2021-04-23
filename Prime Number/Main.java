#include <iostream>
using namespace std;
class prime{
  int n;
  public:
  void cal();
  void print();
};
void prime::cal()
{
  cin>>n;
  int close=0;
  for(int i=2;i<n;i++)
  {
    if(n%i==0)
    {
      cout<<"Not Prime";
      close=1;
      break;
         }
  }
  if(close==0)
  cout<<"Prime";

}
    

int main() 
{
   prime s;
   s.cal();
   return 0;
}