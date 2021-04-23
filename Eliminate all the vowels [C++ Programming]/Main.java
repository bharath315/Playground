#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

void consonants(char *str)
{
    char a[11]={'a','e','i','o','u','A','E','I','O','U'} ;
  int len1=strlen(str);
  char b[len1];
  int k=0,len2;
  for(int i=0;i<len1;i++)
  {
    int c=0;
    for(int j=0;j<10;j++)
    {
      if(str[i]!=a[j])
      {
        c++;
        continue;
      }
    }
    if(c==10)
    {
        b[k]=str[i];
        k++;
    }
  }
 len2=strlen(b);
   for(int i=0;i<len2;i++)
   {
     cout<<b[i];
   }
}

int main()
{
    char str[100];
    scanf("%s",str);
    consonants(str);
    return 0;
}


