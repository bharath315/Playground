#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int weight,age;
  cin>>age>>weight;
  if( weight>=50 && age>17)
    cout<<"Eligible to donate blood:)";
  else 
    cout<<"Not eligible to donate blood:(";
    return 0;
}