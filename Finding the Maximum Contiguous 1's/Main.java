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
  int c=0,m_c=0;
  for(i=0;i<n;i++)
  {
    if(a[i]==0)
    {
      if(m_c<c)
        m_c=c;
      c=0;
    }
    if(a[i]==1)
      c++;
  }
  printf("%d",m_c);
  return 0;
}