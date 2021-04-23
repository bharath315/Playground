#include <iostream>
using namespace std;
int maximum(int n, int a[]);
int main()
{
    int arr[30],s,i,max;
    cout<<"Enter the size of the array\n";
    cin>>s;
    cout<<"Enter "<<s<<" elements of an array\n";
    for(i=0;i<s;i++)
    {
        cin>>arr[i];
    }
        cout<<"Maximum element in the array is "<<maximum(s,arr)<<"\n";
    }
int maximum(int n,int a[])
{
  int max=a[0];
    for(int i=0;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
  return max;
}