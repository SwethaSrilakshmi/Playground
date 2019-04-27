#include<stdio.h>
#include<string.h>
int Left_rotate_str(char str[100],int str_len,char str_left[100],int no_of_rotations);
 
void main()
 {
  char str[100];
  int i;
  scanf("%s", str);
  char str2[100];
  scanf("%s", str2);
  char str_left[100];
  strcpy(str_left,str);
  int str_len = strlen(str);
  for(i=1;i<str_len;i++)
  {
       int res=Left_rotate_str(str2,str_len,str_left,1);
       if(res==1)
           break;
  }
  if(i==str_len)
      printf("No");
  else
      printf("Yes");
 }
  
  
 int Left_rotate_str(char str[100],int str_len,char str_left[100],int no_of_rotations)
 {
  int index;
  for ( int rotation = 1 ; rotation <= no_of_rotations ; rotation++ )
  {
   char temp = str_left[0];    // setting first character to temp
   for( index = 1; index <= str_len-1; index++ )
   {
    str_left[index - 1] = str_left[index]; // shifting other character from right to left
   }
   str_left[index-1] = temp;   // setting last character to temp
  }
  int res=strcmp(str_left,str);
  if(res==0)
      return 1;
  else
      return 0;
 }