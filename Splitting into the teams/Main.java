#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1,n2;
  cin>>n1>>n2;
  int h= n1/n2;
  int u=n1%n2;
  cout<<"The number of friends in each team is "<<h<<" and left out is "<<u;
}