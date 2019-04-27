#include<stdio.h>
int main()
{ 
  int r;
  int c;
  scanf("%d", &r);
  scanf("%d", &c);
  int matrix[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", &matrix[i][j]);
   }
  }
   
  int t[c][r];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
      scanf("%d", &t[i][j]); 
   }
  }
   
  for(int i = 0; i < c; i++)
  {
   for(int j = 0; j < r; j++)
   {
    printf("%d ", matrix[i][j]-t[i][j]);
   }
   printf("\n");
  }
}