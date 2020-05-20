#include<iostream>
#include<vector>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array"<<endl;
  int n,i,t;
  cin>>n;
  vector<int>cards;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++){
    cin>>t;
    cards.push_back(t);
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  int pos; cin>>pos;
  if(pos-n>1)
  {
    cout<<"Invalid Input"<<endl;
    return 0;
  }
  cout<<"Enter the value to insert"<<endl;
  int element; cin>>element;
  cards.insert(cards.begin()+pos-1,element);
  cout<<"Array after insertion is"<<endl;
  for(i=0;i<cards.size();i++)
    cout<<cards[i]<<endl;
  return 0;
}
 