#include<stdio.h>
int main()
{
  //Type your code here
  int n,a[15],count=0,t[15],j=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]!=0)
    {
    	t[j++]=a[i];
    }
    else
      count++;
  }
  for(int c=1;c<=count;c++)
    t[j++]=0;
  for(int i=0;i<n;i++)
  {
    printf("%d ",t[i]);
  }
  return 0;
}