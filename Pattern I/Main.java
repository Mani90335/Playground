#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=4;i++)
  {
    for(j=0;j<i;j++)
    {
      cout<<n+(i-1);
    }
    cout<<endl;
  }
  for(i=4;i>=1;i--)
  {
    for(j=0;j<i;j++)
    {
      cout<<n+(i-1);
    }
    cout<<endl;
  }
  return 0;
}