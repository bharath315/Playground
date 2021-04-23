#include<iostream>
using namespace std;
int main()
{
int n,i,j;
  cin>>n;
  int check=1;
  int matrix[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>matrix[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(matrix[i][j]!=0)
      {
        check=0;
      }
         }
  }
  if(check==1)
  {
    cout<<"Lower Triangular Matrix";
  }
  else
  {
     cout<<"Not a Lower Triangular Matrix";
}
}