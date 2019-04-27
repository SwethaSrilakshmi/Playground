#include<stdio.h>
int sum_f(int n)
{
  int sum=0;
  for(int i=1;i<=n;i++)
    sum=sum+i;
  return sum;
}
int main() {
    int n;
  scanf("%d",&n);
  printf("%d",sum_f(n));
  return 0;
}