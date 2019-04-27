#include <stdio.h>   
int main() 
{ 
    int a[10];
    int n,k;
    scanf("%d",&n);
  	scanf("%d",&k);
    for(int i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    } 
  	for(int j=1;j<=k;j++)
    {
      	int c=0;
      	for(int i=0;i<n;i++)
    	{
      		if(a[i]==j)
              c++;
    	} 
		printf("%d %d\n",j,c);      
    }
    return 0; 
} 