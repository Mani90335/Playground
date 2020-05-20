#include <iostream>
using namespace std;
int main()
{
  int first,second, op;
  cout<<"Enter first number : ";
  cin>>first;
  cout<<"Enter second number : ";
  cin>>second;
  cout<<"Menu"<<'\n';
  cout<<"1.Addition\n""2.Subtraction\n""3.Multiplication\n""4.Division\n""5.Remainder\n";
  cin>>op;
  switch(op)
  {
    case 1: cout<<first+second; break;
      case 2: cout<<first-second; break;
      case 3: cout<<first*second; break;
      case 4: cout<<first/second; break;
      case 5: cout<<first%second; break;
    default: cout<<"Invalid operation"; break;
  }
  return 0;
}
  