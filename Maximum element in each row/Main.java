#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max=0;
  cin>>r>>c;
  int mat[r][c];
  for(i=0;i<r;i++)
  {
    max=0;
    for(j=0;j<c;j++)
    {
      cin>>mat[i][j];
      if(max<mat[i][j])
        max=mat[i][j];
    }
    cout<<max<<'\n';
  }
   return 0;   
}