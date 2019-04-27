// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,arr[10];
  	scanf("%d",&n);
  	for(int i=0;i<n;i++)
      scanf("%d",&arr[i]);
  	int max=0;
  	for(int i=1;i<n;i++)
      if(arr[i]>arr[max])
        	max=i;
  	printf("%d",max);
  return 0;
  
   return 0;
}