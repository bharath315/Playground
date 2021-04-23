#include <stdio.h>
#include <math.h>
int main()
{
  
    int number, temp,temp2, rem, result = 0, n = 0 ;
    scanf("%d", &number);
    temp = number;
    while (temp != 0)
    {
        temp=temp/10; 
         n++;
    }
    temp2 = number;
    while (temp2 != 0)
    {
      
	  rem =temp2 % 10;
        result=result+ pow(rem, n);
        temp2 = temp2/10;
    }
    if(result == number)
        printf("Armstrong number");
    else
        printf("Not an Armstrong number");	
  
}
