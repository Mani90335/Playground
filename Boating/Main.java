#include<iostream>
using namespace std;
int main()
{
  int boat,adult,child;
  cin>>boat>>adult>>child;
  (boat >= adult*75 + child*30) ? cout<<"Boat is stable" : cout<<"Boat will drow";
  return 0;
}