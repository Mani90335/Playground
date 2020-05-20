#include <iostream>
using namespace std;
int main()
{
  int beg = 6;
  int n,i; cin>>n;
  for(i=0;i<n;i++)
  {	
   	cout<<beg<<" ";
    beg += 5*(i+1);
  }
  return 0;
}