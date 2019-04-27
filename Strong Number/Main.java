#include <stdio.h>
int fact(int n)
{
  int f=1;
  for(int i=1;i<=n;i++)
  {	
    f=f*i;
  }
  return f;
}
  
int main() {
	//Type your code
  int n,f=1,sum=0;
  scanf("%d",&n);
  int num=n;
  while(n>0)
   {
      int last_digit=n%10;
      sum=sum+fact(last_digit);
      n=n/10;
    }
 
  	if(sum==num)
      {
        printf("Yes");
      }
  else
  {
    printf("No");
  }
	return 0;
}