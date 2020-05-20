#include <iostream>
using namespace std;
int main()
{
  float beg = 0.5;
  int n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
   	cout<<beg<<" ";
    beg *= 3;
  }
  return 0;
}