#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  getline(cin,b);
  reverse(a.begin(),a.end());
  if(a==b)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}