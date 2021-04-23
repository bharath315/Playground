#include <iostream>
using namespace std;
//intilization of pointers 
int *roll=NULL;
int *marks=NULL;
double *lol;
int main() 
{
   int n,i;
  cin>>n;
  roll= new int[n];
  marks= new int[n];
  if(!(roll) || !(marks))
  { 
    cout<<"Out of Memory..!!..Aborting..!!"<<endl;
    cout<<"Press any key to exit..";
    exit(0);
  }
  for(i=0;i<n;i++)
    cin>>roll[i]>>marks[i];
   for(i=0;i<n;i++)
    cout<<roll[i]<<" "<<marks[i]<<endl;
  delete[] roll;
  delete[] marks;
  delete[] lol;
  return 0;
}