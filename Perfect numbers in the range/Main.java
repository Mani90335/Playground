#include <iostream>
using namespace std;
bool isPerfect(int n)
{
  int sum=0,i;
  for(i=1;i<n;i++)
  {
    if(n%i==0)
      sum+=i;
  }
  if(sum==n)
    return true;
  else
    return false;
}
int main()
{
  int f,l,i;
  cin>>f>>l;
  for(i=f;i<=l;i++)
  {
    if(isPerfect(i))
      cout<<i<<" ";
  }
  return 0;
}