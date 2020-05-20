#include<iostream>
using namespace std;
int main()
{
    int n,so=0,se=0,i;
  	cin>>n;
  	int arr[n];
  	for(i=0;i<n;i++)
    {
      cin>>arr[i];
      if(arr[i]%2==0)
        se+=arr[i];
      else
        so+=arr[i];
    }
  cout<<"The sum of the even numbers in the array is "<<se<<'\n';
  cout<<"The sum of the odd numbers in the array is "<<so;
  return 0;
}