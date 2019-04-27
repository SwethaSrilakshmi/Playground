#include <stdio.h>
int greatest(int a,int b)
{
  if(a>b)
    return a;
  else
    return b;
}
int main(){
	// Type your code here
  	int a,b,c;
  	scanf("%d%d%d",&a,&b,&c);
    int g1=greatest(a,b);
  	printf("%d",greatest(g1,c));
  	return 0;
}