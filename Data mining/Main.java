#include<iostream>
#include<string>
using namespace std;
int main()
{
  int n,odd =0, even =0,t;
  string ip; cin>>ip;
  for(t=0;t<ip.length();t++)
  {
    if((ip[t]-48)%2==0)
      even += (ip[t]-48);
    else
      odd += (ip[t]-48);
  }
  if(even == odd)
    cout<<"Yes";
  else
    cout<<"No";
}