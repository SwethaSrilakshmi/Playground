#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[10];
  gets(str);
  int i,n=strlen(str);
  for(i=0;i<=n/2;i++)
  {
    if(str[i]==str[n-i-1])
      continue;
    else
    {
      printf("%s is not a palindrome",str);
      break;
    }
  }
  if(i==(n/2)+1)
    printf("%s is a palindrome",str);
      return 0;
}