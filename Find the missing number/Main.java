#include<stdio.h>
#include<stdlib.h>
int main()
{
  //Type your code here
  int a[10];
  int n,i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=1;i<=n+1;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==a[j])
        break;
     }
    if(j==n)
    {
      printf("%d",i);
      break;
    }
  }
  return 0;
}