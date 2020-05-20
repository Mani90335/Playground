#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int chalk, days;
  cin>>chalk;
  days = chalk;
  chalk = (1/sqrt(chalk)) * chalk;
  days += chalk;
  cout<<days+1;
  return 0;
 }