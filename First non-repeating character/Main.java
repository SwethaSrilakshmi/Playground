#include<stdio.h>
#include<string.h>
int main()
{
	//Try out your code here
  	char str[30];
  	gets(str);
  	int n=strlen(str),j,flag=0;
  for(int i=0;i<n-1;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(str[i]==str[j])
      {
        str[j]=' ';
        flag=1;
        break;
      }
      else
      {
        flag=0;
      }
    }
    if(j==n && str[i]!=' ') 
    {
      printf("%c",str[i]);
      break;
    }
  }
  if(flag==1)
    printf("All the characters are repetitive");
	return 0;
}