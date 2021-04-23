#include<bits/stdc++.h>
using namespace std;

int main()
{  
double fact = 1, n, i;
cin>>n;

for(i =1; i <= n; i++)
{
     fact = fact * i;
}
cout.precision(17);
cout << fact << endl;
//cout<<fact;  
return 0;
}
