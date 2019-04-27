#include<stdio.h>
#include<math.h>
int power(int b,int e)
{
  int res=1;
  while(e>0)
  {
    res=res*b;
    e--;
  }
  return res;
}
int main(){
    // Type your code here
	int b,e;
  	scanf("%d%d",&b,&e);
	printf("%d",power(b,e));
  	return 0;
}