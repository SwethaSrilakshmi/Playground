#include<stdio.h>
int main()
{
	//Try out your code here
  	int n,a[10];
  	scanf("%d",&n);
  	for(int i=0;i<n;i++)
      scanf("%d",&a[i]);
  int n1=n/2;
  	for(int i=0;i<n1-1;i++)
    {
      for(int j=0;j<n1-i-1;j++)
      {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
  for(int i=0;i<n;i++)
    printf("%d ",a[i]);
	return 0;
}