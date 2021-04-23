#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	string name;
	map<string,int>m;
	
	while(n--)
	{
		cin>>name;
		m[name]++;
		
	}
	map<string,int>::iterator it;
	for(it=m.begin();it!=m.end();it++)
	{
		cout<<it->first<<" "<<it->second<<endl;
	}
	return 0;
}
