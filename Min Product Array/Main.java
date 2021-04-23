#include <iostream>
#include <bits/stdc++.h>
using namespace std;
long int minproduct( long int a[],long int b[],long int n,long int k)
{
  long int  c[n],pro,res=0,temp,diff=0,i;
  for( i=0;i<n;i++)
  {
    pro=a[i]*b[i];
    res=res+pro;
    if (pro < 0 && b[i] < 0)  // b[i] is -ve
			temp = (a[i] + 2 * k) * b[i];
			
		else if (pro < 0 && a[i] < 0) // pro -ve and a[i] -ve
			temp = (a[i] - 2 * k) * b[i];
			
		else if (pro > 0 && a[i] < 0) // pro +ve and a[i] -ve
			temp = (a[i] + 2 * k) * b[i];
			
		else if (pro > 0 && a[i] > 0) // pro +ve and a[i] +ve
			temp = (a[i] - 2 * k) * b[i];
    
   long int d= abs( pro-temp);
    if( d>diff)
    {
      diff=d;
  }
  }
   cout<< res-diff;
  }
    
  

int main() 
{
   // Try out your code here
    long int n,k,i;
   cin>>n>>k;
  long int a[n],b[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    cin>>b[i];
  }
  minproduct(a,b,n,k);
  return 0;
   
}
  
