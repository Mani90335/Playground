#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array"<<endl;
  int n,i; cin>>n;
  bool isEven=true, isOdd=true;
  int arr[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>arr[i];
  for(i=0;i<n;i++)
  {
    if(arr[i]%2!=0)
    {
      isEven = false;
      break;
    }
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      isOdd = false;
      break;
    }
  }
  if(!isEven && !isOdd)
    cout<<"The array is Mixed";
  else if(!isEven)
    cout<<"The array is Odd";
  else 
    cout<<"The array is Even";
  return 0;
 }