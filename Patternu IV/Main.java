#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
   cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0){
    for(j=0;j<n-1;j++)
    {
      cout<<i;
    }
      cout<<i+1;
      cout<<'\n';
    }
    else
    {
      cout<<i+1;
      for(j=0;j<n-1;j++)
    {
      cout<<i;
    }
      cout<<'\n';
    }
  }
    return 0;
}