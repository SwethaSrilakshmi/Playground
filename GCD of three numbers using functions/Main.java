#include <stdio.h>
int gcd(int a,int b)
{
  int min;
  if(a<b)
    min=a;
  else
    min=b;
  while(min>=1)
  {
    if(a%min==0&&b%min==0)
      return min;
     else
       min--;
  }
  return -1;
}
int main(){
	// Type your code here
  	int a,b,c;
  	scanf("%d%d%d",&a,&b,&c);
    int g1=gcd(a,b);
  	printf("%d",gcd(g1,c));
  	return 0;
}