#include<iostream>
using namespace std;
struct student 
{
  int s1;
  int s2;
  int rn;
  int s3;
  int s4;
  int s5; 
  int grade;
  float avg;
}d1,d2;
int main()
{
  int n;
  cin>>n;
  cin>>d1.rn;
  cin>>d1.s1;
  cin>>d1.s2;
  cin>>d1.s3;
  cin>>d1.s4;
  cin>>d1.s5;
  cin>>d2.rn>>d2.s1>>d2.s2>>d2.s3>>d2.s4>>d2.s5;
  d1.avg=(d1.s1+d1.s2+d1.s3+d1.s4+d1.s5)/5;
  d2.avg=(d2.s1+d2.s2+d2.s3+d2.s4+d2.s5)/5;
  //cout<<d2.avg;
  if( d1.avg >=70)
  d1.grade=1;
  else if(d1.avg<70 && d1.avg >=50)
    d1.grade=2;
  else if(d1.avg<50)
    d1.grade=3;
    if( d2.avg >=70)
  d2.grade=1;
  else if(d2.avg<70 && d2.avg >=50)
    d2.grade=2;
  else if(d2.avg<50)
    d2.grade=3;
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  cout<<d1.rn<<" "<<d1.s1<<" "<<d1.s2<<" "<<d1.s3<<" "<<d1.s4<<" "<<d1.s5<<" "<<d1.avg<<" "<<d1.grade<<endl;
  cout<<d2.rn<<" "<<d2.s1<<" "<<d2.s2<<" "<<d2.s3<<" "<<d2.s4<<" "<<d2.s5<<" "<<d2.avg<<" "<<d2.grade<<endl;
}