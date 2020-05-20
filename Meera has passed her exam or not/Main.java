#include<iostream>
using namespace std;
int main()
{
  int n,i,query; cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  cin>>query;
  for(i=0;i<n;i++)
  {
    if(arr[i]==query)
    {
      cout<<"She passed her exam";
      return 0;
    }
  }
  cout<<"She failed";
  return 0;
}