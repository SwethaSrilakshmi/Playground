#include <stdio.h>
int main() {
	// Type your code here
   int n;
  scanf("%d",&n);
  int s=1;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<n-i+1;j++)
    {
      printf(" ");
    }
    for(int k=1;k<=i;k++)
    {
      printf("%d ",s);
      s++;
    }
    printf("\n");
  }
	return 0;
}