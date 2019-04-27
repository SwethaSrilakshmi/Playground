#include<stdio.h>
int main()
{
  //fill the code
  int n,arr[10];
  	scanf("%d",&n);
  	for(int i=0;i<n;i++)
      scanf("%d",&arr[i]);
  	int max=0;
  	for(int i=1;i<n;i++)
      if(arr[i]>arr[max])
        	max=i;
  	printf("%d",arr[max]);
  return 0;
}
