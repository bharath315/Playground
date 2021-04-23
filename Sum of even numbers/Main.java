#include<iostream>
using namespace std;
int SumOfEven(int a[],int num,int sum)
{
  if(num>=0)
 {
  if((a[num])%2==0)
  {
   sum+=(a[num]); 
  }
  SumOfEven(a,num-1,sum);
 }
 else
 {
     return sum;
 }
}
int main()
{
  int n,i,j,sum=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  cout<<"The sum of the even elements in the array is "<<SumOfEven(arr,n,sum);
}