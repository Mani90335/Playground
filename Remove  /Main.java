#include <iostream>
#include <string>
using namespace std;
int main()
{
  string ip;
  int i;
  getline(cin,ip);
  for(i=0;i<ip.length();i++)
  {
    if((ip[i]=='t'||ip[i]=='T')&&ip[i+1]=='h'&&ip[i+2]=='e')
      i+=3;
    else cout<<ip[i];
  }
  return 0;
}