#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y;
  cin>>w>>x>>y;
  int sale = w * x;
  int cost = (w * y) + 100;
  cout<<sale-cost;
  return 0;
}