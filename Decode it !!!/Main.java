#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s", str);
    int key;
    scanf("%d", &key);
    int str_len = strlen(str);
    
    for(int index = 0; index <= str_len - 1; index++)
    {
      char ch = str[index];
      if(ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - 'A';
        key=key%26;
        offset = (offset - key);
         if(offset<0)
          offset+=26;
        ch = offset + 'A';
      }
      else if(ch >= 'a' && ch <= 'z')
      {
        int offset = ch - 'a';
        key=key%26;
        offset = (offset - key) ;
        if(offset<0)
          offset+=26;
        ch = offset + 'a';
      }
      str[index] = ch;
    }
    printf("%s", str);
}