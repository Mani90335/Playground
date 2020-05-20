#include<iostream>
#include <cstdio>
using namespace std;
int main()
{
  int n,count=0;
  float score=0;
  while(cin>>n)
  {
    if(n % 2 !=0 && n>0){
      count++;
      score+=1;
      if(count == 3) break;
    }
    else if(n % 2 ==0 && n>0)
    {
      score -= 0.5;
    }
    else if(n<0)
    {
      score -= 1;
      break;
    }
  }
  printf("%.1f",score);
  return 0;
}