#include<iostream>
using namespace std;
int birth(int t)
{
	const int mod=1e9+7;
	t= t%mod;
	int ans = t*(2*t-1);
	ans=ans%mod;
	return ans;
	
}
int main()
{
	int n;
	cin>>n;
	int t;
	for(int i=0;i<n;i++)
	{
		cin>>t;
		int h= birth(t);
		cout<<h<<endl;
	}
	return 0;
}