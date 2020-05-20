#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  cin>>r>>c;
  int mat[r][c];
  for(i=0;i<r;i++)
  {
    sum=0;
    for(j=0;j<c;j++)
    {
      cin>>mat[i][j];
      sum += mat[i][j];
   }
    cout<<sum<<'\n';
  }
  return 0;
}