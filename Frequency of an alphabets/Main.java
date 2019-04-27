#include <stdio.h>
#include <string.h>
 
int main()
{ 
 char str1[1000];
 gets(str1);
 int string1_len = strlen(str1);
 int stat[26];
  
 for (int idx = 0; idx <= 25; idx++)
 {
   stat[idx] = 0;
 }
  
 for (int idx = 0; idx <= string1_len; idx++)
 {
   if(str1[idx] >= 'a' && str1[idx] <= 'z')
   {
     int offset = str1[idx] - 'a';
     stat[offset]++;
   }
    
   else if(str1[idx] >= 'A' && str1[idx] <= 'Z')
   {
     int offset = str1[idx] - 'A';
     stat[offset]++;
   }
 }
  
 int is_same = 0;
 for (int idx = 0; idx <= 25; idx++)
 {
   if(stat[idx] >0)
   {
     printf("%c%d ",idx+'a',stat[idx]);
   }
 }

 return 0;
}