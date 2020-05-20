#include<iostream>
#include<cstdio>
#include<string>
using namespace std;
int main()
{
  int age; string time;
  cin>>age;
  cin.ignore(32767,'\n');
  cin>>time;
  
  if(age>=13) //assumption of >=.. change to > if it doesn't work
  {
    if(time != "13.30")
      printf("$%.2f",8.00);
    else
      printf("$%.2f",5.00);
  }
  else
  {
    if(time != "13.30")
      printf("$%.2f",4.00);
    else
      printf("$%.2f",2.00);
  }
   return 0; 
}