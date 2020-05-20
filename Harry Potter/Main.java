#include<iostream>
using namespace std;
int main()
{
  int n, first,second,third,fourth;
  cin>>n;
   first = n % 10;
n /= 10;
second = n % 10;
n /= 10;
  third=n%10;
  n/=10;
  fourth=n%10;
  n/=10;
cout << first + fourth;
}