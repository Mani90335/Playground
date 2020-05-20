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
      arr[j][i] = (i)*row + (j+1);
    }
  }
  for(i=0;i<row;i++)
  {
    if(arr[i][1] == tree || arr[i][col-2] == tree)
    {
        cout<<"It is a mango tree";
        return 0;
    }
  }
  cout<<"It is not a mango tree";
  return 0;
}
