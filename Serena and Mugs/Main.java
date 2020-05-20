#include<iostream>
using namespace std;
int main()
{
  int n,s,i,c=0;
  cin>>n>>s;
  int mugs[n];
  for(i=0;i<n;i++)
  {
    cin>>mugs[i];
    c += mugs[i];
    if(c>s)
    {
      cout<<"NO";
      return 0;
    }
  }
   cout<<"YES";
  return 0;
}