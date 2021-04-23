#include<bits/stdc++.h>
using namespace std;
int main(){
    long long t;
    t=1;
    while(t--){
        long long n;
        cin>>n;
        long long a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        int max_length = 1;
        int start = 0, end = 0, max_start = 0, max_end = 0;
        for (int i = 1; i < n; i++)
        {
            if(a[i]>=a[i-1]){
                end=i;
                if(end-start>max_length){
                    max_length=end-start;
                    max_start=start;
                    max_end=end;
                }
            }
            else{
                start=i;
                end=i;
            }
        }
        for (int i = max_start; i <= max_end; i++)
        {
            cout<<a[i]<<" ";
        }
        cout<<endl;
    }
    return 0;
}




