#include <iostream>
using namespace std;
int main()
{
  int n1,n2,sum=0; cin>>n1>>n2;
  int numb = n1+n2;
  for(int i = 1; i < numb; i++)
  {
    if(numb%i==0)
      sum+=i;
  }
  if(sum == numb)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}