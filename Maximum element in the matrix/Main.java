#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0,i,j;
  cin>>r>>c;
  int mat[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>mat[i][j];
      if(max<mat[i][j])
        max = mat[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
  return 0;
}