#include <iostream>
using namespace std;
class SuperMarket
{
  public:
  int book;
  void purchased()
  {
    cout<<"I Purchased "<<book<<" Books";
  }
};

int main() 
{
  SuperMarket s;
  int n;
  cin>>n;
  s.book=n;
  s.purchased();
    return 0;
}