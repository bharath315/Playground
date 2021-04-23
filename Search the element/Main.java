#include<iostream>
using namespace std;
#include<math.h>
int count;
int search(int start,int n,int arr[],int ele);
int main()
{
    int n,i,ele,start=0;
    cin>>n;
    int arr[n];
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cin>>ele;
    search(start,n,arr,ele);
    return 0;
}
int search(int start,int n,int arr[],int ele)
{
    if(start!=n)
    {
        if(arr[start]==ele)
        {
            cout<<ele;
            return 0;
        }
        else
        {
            return arr[start]==(search(start+1,n,arr,ele));
            return start;
          cout<<"The number is not present in the list";
        }
    }
  else 
    cout<<"The number is not present in the list";
}