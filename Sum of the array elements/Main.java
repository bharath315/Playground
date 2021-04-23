#include<iostream>
using namespace std;
#include<math.h>
int sumofelements(int p[10],int n)
{
    if(n<0)
        return 0;
    return (sumofelements(p,n-1)+p[n]);
}
int main()
{
    int x,a[10],b;
    cin>>x;
    for(int i=0;i<x;i++)
        cin>>a[i];
    cout<<sumofelements(a,x);
}