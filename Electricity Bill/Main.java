#include<iostream>
using namespace std;
int main()
{
  int units;
  int bill;
  cin>>units;
  if(units <= 200)
    bill = units * 0.5;
  else if(units > 200 && units <= 400)
    bill = 100 + units*0.65;
  else if(units > 400 && units <= 600)
    bill = 200 + units*0.80;
  else
    bill = 425 + units*1.25;
  cout<<"Rs."<<bill;
  return 0;
}
