#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum; int i;
  	cin>>fnum;
  	for(i=0;i<fnum.length();i++)
    {
      if(fnum[i]=='.')
        break;
    }
   ++i;
  cout<<"Floating part is : ";
  for(;i<fnum.length();i++)
    cout<<fnum[i];
  return 0;
	
}