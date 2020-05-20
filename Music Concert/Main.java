#include<iostream>
using namespace std;
int main(){
  int n,t,c=0,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>t;
    if(t%2==0)
      c++;
  }
  cout<<n-c<<'\n'<<c;
  return 0;
}