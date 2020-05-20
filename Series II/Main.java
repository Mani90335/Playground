#include <iostream>
using namespace std;
int main()
{
  int beg = 11;
  int n,i; cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<beg*beg<<" ";
    beg += 4;
  }
  return 0;
}