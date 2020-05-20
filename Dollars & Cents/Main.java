#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int fd,fc,sd,sc;
  float fractpart, intpart;
  cin>>fd>>fc>>sd>>sc;
  float f = (float)fd + (0.01 * (float)fc);
  float s = (float)sd + (0.01 * (float)sc);	
  fractpart = modf(f+s,&intpart);
  cout<<intpart<<'\n'<<(int)round((fractpart)*100);
  return 0;
}

