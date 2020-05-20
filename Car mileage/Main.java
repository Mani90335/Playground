#include<iostream>
using namespace std;
int main()
{
  float mileage, distance;
  int litres;
  cin>>mileage>>litres>>distance;
  float tot_dist = mileage * litres;
  if(distance<=tot_dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}