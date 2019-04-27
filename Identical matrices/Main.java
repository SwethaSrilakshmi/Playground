#include <stdio.h>
int main()
{ 
  int m,n;
  scanf("%d%d",&m,&n);
  int a[m][n],flag=1;
    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++) 
      {
        scanf("%d",&a[i][j]);
      }
    }
  int b[m][n];
    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++) 
      {
        scanf("%d",&b[i][j]);
      }
    }
  for(int j=n-1; j>=0; j--)
    {
      for(int i=0; i<n; i++) 
      {
        if(a[i][j]!=b[i][j])
          flag=0;
      }
	
    }
  if(flag)
   printf("Yes");
  else
    printf("No");
}