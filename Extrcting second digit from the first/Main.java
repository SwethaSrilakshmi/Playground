#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  	int num,i=0,n;
 
  scanf("%d",&num);
   n=num;
  while(num>0)
  {
    num=num/10;
    i=i+1;
  }
  int res=n/(pow(10,i-2));
	printf("%d",res%10);	
  return 0;
}