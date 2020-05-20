#include<iostream>
using namespace std;
int main()
{
  int n,i,j; cin>>n;
  int sq[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>sq[i][j];
  int ld = 0,rd=0;
  for(i=0,j=0;i<n,j<n;i++,j++)
    ld += sq[i][j];
  for(i=0,j=n-1; i<n,j>=0 ;i++,j--)
    rd += sq[i][j];
  if(ld==rd)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}
