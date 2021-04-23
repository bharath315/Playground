#include<iostream>
int main()
{
  int a,b,n,q,w,e,r,t,y;
  std::cin>>a>>b>>n;
  std::cout<<"Enter first number : Enter second number : Menu"<<std::endl;
  std::cout<<"1.Addition"<<std::endl<<"2.Subtraction"<<std::endl<<"3.Multiplication"<<std::endl<<"4.Division"<<std::endl<<"5.Remainder"<<std::endl;
  switch(n)
  {
    case 1:
      q=a+b;
      std::cout<<q;
      break;
    case 2:
      w=a-b;
      std::cout<<w;
      break;
    case 3:
      e=a*b;
      std::cout<<e;
      break;
    case 4:
      r=a/b;
      std::cout<<r;
      break;
    case 5:
      t=a%b;
      std::cout<<t;
      break;  
    default:
      std::cout<<"Invalid operation";
  }
}  
      
      