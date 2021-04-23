#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    int oct=0,r,power=1;
  while(n!=0)
  {
    r=n%8;
    oct=oct+r*power;
     power=power*10;
    n=n/8;
  }
  return oct;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
