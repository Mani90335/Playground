#include <iostream>
#include <algorithm>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
int main()
{
  int arr[3];
  cin>>arr[0]>>arr[1]>>arr[2];
  sort(arr,arr+3);
  cout<<"The treasure is in box which has number "<<arr[1]<<'\n';
  cout<<"The code to open the box is "<<gcd(arr[0],gcd(arr[1],arr[2]));
  return 0;
}