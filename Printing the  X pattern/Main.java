#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int s=1;
  int e=n;
  for(int i=1;i<=n;i++)
  {
   	for(int k=1;k<=n;k++)
    {	
      if(k==s)
        printf("*");
      else if(k==e)
        printf("*");
      else
        printf(" ");
    }
    s++;
    e--;
    printf("\n");
  }
  
	return 0;
}