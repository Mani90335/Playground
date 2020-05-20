#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max=0,sum=0,t;
  cin>>r>>c;
  int mat[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>mat[i][j];
  cout<<"Sum of rows is ";
 for(i=0;i<r;i++)
 {
   sum = 0;
    for(j=0;j<c;j++)
    {
      sum+=mat[i][j];
    }
   if(sum>max)
   {
     max = sum;
     t = i;
   }
   cout<<sum<<" ";
 }
  cout<<'\n';
  cout<<"Row "<<t+1<<" has maximum sum"<<'\n';
  max = 0;
   cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
      {
        sum = 0;
        for(j=0;j<r;j++)
        {
          sum += mat[j][i];
        }
        if(sum>max)
        {
          max = sum;
          t = i;
        }
        cout<<sum<<" ";
      }
     cout<<'\n';
     cout<<"Column "<<t+1<<" has maximum sum";
      return 0;
}