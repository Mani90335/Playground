#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
int main()
{
  string ip;
  getline(cin,ip);
  reverse(ip.begin(),ip.end());
  cout<<ip;
  return 0;
}