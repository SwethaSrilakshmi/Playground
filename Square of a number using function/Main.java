#include<stdio.h>
int square(int n)
{
  return n*n;
}
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  printf("%d",square(n));
  return 0;
}