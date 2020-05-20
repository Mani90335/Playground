#include<iostream>
using namespace std;
int main()
{
  int n,i,c=1;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<c<<"\n";
  for(i=1;i<n;i++)
  {
    if(a[i]>a[i-1])
    {
      if(c==1)
       c=c*2;
      else
        c=c+2;
      cout<<c<<"\n";
    }
    else
    {
      if(c==1)
      {
        cout<<c<<"\n";
      }
      else
        cout<<c/2<<"\n";
      
  }
  
}
}