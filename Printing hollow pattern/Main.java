#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
   	if(i==1||i==n)
    {
      for(int k=1;k<=n;k++)
      {
		printf("*");
      }
    }
    else
    {
     	for(int j=1;j<=n;j++)
        {
          if(j==1||j==n)
            printf("*");
          else
            printf(" ");
        }
    }
    printf("\n");
  }
	return 0;
}