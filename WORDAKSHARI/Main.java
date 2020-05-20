#include <iostream>
#include <string>
using namespace std;
int main()
{
  string ip,prev;
  cin>>prev;
  cout<<prev<<endl;
  while(1)
  {
    cin>>ip;
    if((prev[prev.length()-1]!=ip[0]) || ip == "####")
      break;
    else
    {
      cout<<ip<<endl;
      prev=ip;
    }
  }
  return 0;
}