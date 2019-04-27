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
  int c=0,num,j,c_p=0,k=0;
  for(i=0;i<n-1;i++)
  {
    c=0;
    for(j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
      {
        c++;
      }
    }
    if(c>c_p)
    {
      c_p=c;
      k=a[i];
    }
  }
  if(c_p==0)
  	printf("%d",a[0]);
  else
    printf("%d",k);
  return 0;
}