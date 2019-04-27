#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  	int n,sum=0;
  	scanf("%d",&n);
  	int num=n;
  	while(n>0)
    {
      int last_digit=n%10;
      sum=sum+pow(last_digit,3);
      n=n/10;
    }
  	if(sum==num)
      {
        printf("Armstrong Number");
      }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}