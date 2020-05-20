#include<iostream>
using namespace std;
int main()
{
 int r,c,i,j,max;
  cin>>r>>c;
 int mat[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>mat[i][j];
  if(i==j)
  {
  for(i=0;i<r;i++){
    max=0;
    for(j=0;j<c;j++)
      if(mat[j][i]>max)
        max=mat[j][i];
    cout<<max<<endl;
  }
  }
  else
  {
    for(i=0;i<c;i++)
    {
      max=0;
      for(j=0;j<r;j++)
      {
         if(max<mat[j][i])
           max=mat[j][i];
      }
      cout<<max<<endl;
    }

      
}
  return 0;
}