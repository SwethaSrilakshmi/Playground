#include<stdio.h>
int main()
{
  //Type your code here
  int a[10];
  int i,n;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int sum=a[0],s_p=0,m_sum=0;
  for(i=1;i<n;i++)
  {
    if(a[i]<a[i-1])
    {
      sum=a[i];
    }
    else
    {
      sum=sum+a[i];
    }
  }
  printf("%d",sum);
  return 0;
}