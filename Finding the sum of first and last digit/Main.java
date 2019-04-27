#include <stdio.h>
int main() {
	//Type your code
  int num,i=0,n;
 
  scanf("%d",&num);
   n=num;
  int last_digit=n%10;
  while(num>0)
  {
    num=num/10;
    i=i+1;
  }
  int first_digit=n/(pow(10,i-1));
  printf("%d",first_digit+last_digit);
	return 0;
}