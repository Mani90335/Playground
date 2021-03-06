#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    // Everything divides 0  
    if (a == 0) 
       return b; 
    if (b == 0) 
       return a; 
   
    // base case 
    if (a == b) 
        return a; 
   
    // a is greater 
    if (a > b) 
        return gcd(a-b, b); 
    return gcd(a, b-a); 
} 
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  gcd(a,gcd(b,c)) == d ? cout<<"Answer is correct." : cout<< "Answer is wrong.";
  return 0;
}