#include<iostream>
#include<string>
using namespace std;
int main()
{
  string ip;
  int sum = 0,i;
  cin>>ip;
  while(ip.length()!=1)
  {
    sum = 0;
    for(i=0;i<ip.length();i++)
      sum += ip[i]-48;
    ip = to_string(sum);
  }
  cout<<ip;
  return 0;
}