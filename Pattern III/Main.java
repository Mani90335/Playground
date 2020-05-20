#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=0;j<i-1;j++)
    {
      cout<<i<<'*';
    }
    cout<<i;
    cout<<endl;
  }
  for(i=n;i>=1;i--)
  {
    for(j=0;j<i-1;j++)
    {
      cout<<i<<'*';
    }
    cout<<i;
    cout<<endl;
  }
  return 0;
}