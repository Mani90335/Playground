#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
  int items; float time;
  cin>>items>>time;
  if(items>3)
    cout<<"Number of items is more";
  else if(items==1)
    printf("%.2f",time);
  else if(items==2)
    printf("%.2f",time+(0.5*time));
  else if(items==3)
    printf("%.2f",time*2);
  return 0;
}