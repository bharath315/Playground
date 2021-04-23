#include<stdio.h>

int main()
{
    int N,i,sum=0;  //N as an int
    int arr[100000];
    scanf("%d", &N);  //Entering the value of N
 
    for(i=0;i<N;i++)
	{
       scanf("%d", &arr[i]);
	} //Entering the value in array
 
    for(i=0;i<N;i++){
        // cout<<"sum value = "<<sum<<endl;
        // cout<<"arr value = "<<arr[i]<<endl;
        sum=sum^arr[i];  //Logical value
    }
 
    if(sum==0)
        printf("JASBIR");  //Output the Name of winner
    else
        printf("AMAN"); 
    return 0;
}