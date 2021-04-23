#include<iostream>
using namespace std;
int main()
{
	int n;
	string s;
	cin>>n;
	cin>>s;
	int l=s.length();
	int d=n;
	bool a[d];
	for(int i=0;i<d;i++)
	{
		a[i]=true;
	}
	int i=0,j=0;
	while(n!=1)
	{
		if(a[i]==true)
		{
			if(s[j]==('y'))
			{
				a[i]=false;
				n--;
				j++;
			}
			else j++;
		}
		i++;
		if(i>=d)
		i=0;
		if(j>=l)
		j=0;
		
	}
  int r;
	for(int i=0;i<d;i++)
	{
		if(a[i]==true)
		 r= i+1;
	}
	cout<<r;
	return 0;
}