#include <stdio.h>
int main() {
	//Type your code
  int count=0,number;
  scanf("%d",&number);
  while(number>0)
  {
    int last_digit=number%10;
    count=count+last_digit;
    number=number/10;
  }
  printf("%d",count);
	return 0;
}