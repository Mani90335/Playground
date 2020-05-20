#include<iostream>
using namespace std;
int main()
{
  int ip,temp,sum=0;
  cin>>ip;
  temp =  ip;
  while(temp!=0)
  {
    sum+= temp%10;
    temp /= 10;
  }
  if(ip%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}