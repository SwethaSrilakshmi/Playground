#include <stdio.h>
int main(){
	// Type your code here
  int m,n,c=1;
  scanf("%d%d",&m,&n);
  for(int i=1;i<=m;i++)
  {
    for(int j=1;j<=i;j++)
  	{
    	if(c%2==0)
        {
          printf("#");
        }
      	else
        {
          printf("*");
        }
      c++;
  	}		
    printf("\n");
  }	
  return 0;
}