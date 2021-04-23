#include<iostream>
using namespace std;
struct data
{
  char name[30];
  int id;
  int age;
  char degi[30];
  int sal;
}s;
int main()
{
  cin>>s.name;
  cin>>s.id;
  cin>>s.age;
  cin>>s.degi;
  cin>>s.sal;
  cout<<"Enter name:"<<endl<<"Enter ID:"<<endl<<"Enter age:"<<endl<<"Enter designation:"<<endl<<"Enter Salary:"<<endl<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<s.name<<endl;
  cout<<"ID of the Employee : "<<s.id<<endl;
  cout<<"Age of the Employee : "<<s.age<<endl;
  cout<<"Designation of the Employee : "<<s.degi<<endl;
  cout<<"Salary of the Employee : "<<s.sal<<endl;

}