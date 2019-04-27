/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
   int n,arr[10];
  	scanf("%d",&n);
  	for(int i=0;i<n;i++)
      scanf("%d",&arr[i]);
  int sum_1=0,sum_2=0;	
  for(int i=0;i<3;i++)
    {
      sum_1=sum_1+arr[i];
	  sum_2=sum_2+arr[i+3];
    }
  if(sum_1==sum_2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}