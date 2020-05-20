#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int f =1,n,i;
  cin>>n;
  for(i=2;i<=n;i++)
    f *= i;
  cout<<f;
  return 0;
  
}