#include<stdio.h>
int main()
{
  //Type your code here
  	int n,arr[10];
  	scanf("%d",&n);
  	for(int i=0;i<n;i++)
      scanf("%d",&arr[i]);
  	int a,b,flag1=-1,flag2=-1;
  	scanf("%d%d",&a,&b);
  	for(int i=0;i<n;i++)
    {
      	if(arr[i]==a)
          flag1=i;
      	if(arr[i]==b)
          flag2=i;
    }
  	if(flag1 > -1 && flag2 > -1)
      printf("%d\n%d",flag1,flag2);
  	else if(flag1 > -1)
      printf("%d\n",flag1);
  else if(flag2 > -1)
      printf("%d\n",flag2);
  	if(flag1 == -1 || flag2 == -1)
      printf("-1");
  return 0;
}