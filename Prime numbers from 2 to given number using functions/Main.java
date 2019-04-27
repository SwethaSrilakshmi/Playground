#include<stdio.h>
int isprime(int n)
{
  for(int i=n-1;i>=2;i--)
  {
    if(n%i==0)
      return 0;
  }
  return 1;
}
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(isprime(i))
      printf("%d\n",i);
  }
  
  return 0;
}