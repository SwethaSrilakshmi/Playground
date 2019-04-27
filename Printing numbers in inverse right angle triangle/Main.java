#include <stdio.h>
int main() {
    // Type your code here
   int n;
  scanf("%d",&n);
  int num=n;
  for(int i=1;i<=n;i++)
  {
    for(int k=1;k<=num;k++)
    {
      printf("%d",(num-k+1));
    }
    num--;
    printf("\n");
  }
	return 0;
}