#include<stdio.h>
int sum_n(int n)
{
  	if(n==1)
      return 1;
  	else
      return(n+sum_n(n-1));
}
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  printf("%d",sum_n(n));
	return 0;
}