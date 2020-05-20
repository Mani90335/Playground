#include <iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int mat[r][c],trans[c][r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>mat[i][j];
  for(i=0;i<c;i++){
    for(j=0;j<r;j++)
      cout<<mat[j][i]<<" ";
    cout<<endl;
  }
  return 0;
}