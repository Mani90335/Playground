#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row, col, tree,i,j;
  cin>>row>>col>>tree;
  int arr[row][col];
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      arr[i][j] = (i)*row + (j+1);
    }
  }
  // check for first column and last column and first rol
  for(i=0;i<row;i++)
  {
    if(arr[i][0] == tree || arr[i][col-0] == tree || arr[0][i] == tree)
    {
        cout<<"Yes";
        return 0;
    }
  }
  cout<<"No";
  return 0;
}