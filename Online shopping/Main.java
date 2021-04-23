#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f1,f2,f3,s1,s2,s3,a1,a2,a3,a,b,c,d,e,f;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  a=f2/10;
  b=f1/10;
  c=a*b;
  d=f1-c+f3;
  cout<<"In Flipkart Rs."<<d<<endl;
  a=s2/10;
  b=s1/10;
  c=a*b;
  e=s1-c+s3;
  cout<<"In Snapdeal Rs."<<e<<endl;
  a=a2/10;
  b=a1/10;
  c=a*b;
  f=a1-c+a3;
  cout<<"In Amazon Rs."<<f<<endl;
   if (d <= e&& d <= f) 
        cout << "He will prefer Flipkart"; 
  
    else if (e <= d && e<= f) 
        cout <<"He will prefer Snapdeal"; 
  
    else
        cout << "He will prefer Amazon"; 
  
}