#include <iostream> 
#include<vector>
#include<cmath>
using namespace std; 

void divisors(int n) 
{ 
    vector<int> v; 
    for (int i = 1; i <= sqrt(n); i++) 
    { 
        if (n % i== 0) 
        { 
            if(n/i == i) 
                cout<<i<<" ";
            else
            { 
                cout<<i<<" ";
                v.push_back(n/i); 
            } 
        } 
    } 
    for (int i = v.size()-1; i >= 0; i--) 
       cout<<v[i]<<" ";
} 
int main() 
{ 
    int n;
    cin>>n;
    divisors(n); 
    return 0; 
} 