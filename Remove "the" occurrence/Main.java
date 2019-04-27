#include<stdio.h>
int main()
{
	//Try out your code here
  	char str[100];
  	gets(str);
  	int n=strlen(str),i,j,flag=0,n2=n;
  	for(i=0;i<n;i++)
    {
     	if((str[i]=='t'||str[i]=='T') && str[i+1]=='h' && str[i+2]=='e' && str[i+3]==' ')
        {
          for(j=i;j<n-3;j++)
            str[j]=str[j+4];
          n2=n2-4;
        }
    }
  str[n2]='\0';
  puts(str);
	return 0;
}