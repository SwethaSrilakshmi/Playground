#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int k=-1;
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<=n-1;j++)
    {
      	if(a[i]<a[j])
        {
          if(a[j]>k)
          	printf("%d,%d\n",a[i],a[j]);
          k=a[j];
        }
    }
    k=0;
  }
	return 0;
}