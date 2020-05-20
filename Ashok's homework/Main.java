#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j;
  	cin>>r>>c;
    int mat1[r][c], mat2[r][c];
  	for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        cin>>mat1[i][j];
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        cin>>mat2[i][j];
     for(i=0;i<r;i++)
     {
      for(j=0;j<c;j++)
        cout<< mat1[i][j]+mat2[i][j]<<" ";
      cout<<'\n';
     }
  return 0;
}