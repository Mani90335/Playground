#include <string>
#include <iostream>
using namespace std;
int main()
{
   string str;
  getline(cin,str);
  int c=0;
  for(int i=0;i<str.length();i++)
  {
    if(str[i]==' ')
      c++;
  }
  if(c+1<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";

  return 0;
}