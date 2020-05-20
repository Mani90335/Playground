#include<iostream>
using namespace std;
struct employee
{
  string name,id,age,desg,sal;
}emp;
int main()
{
  cout<<"Enter name:\n";
  cin>>emp.name;
  cout<<"Enter ID:\n";
  cin>>emp.id;
  cout<<"Enter age:\n";
  cin>>emp.age;
  cout<<"Enter designation:\n";
  cin>>emp.desg;
  cout<<"Enter Salary:\n";
  cin>>emp.sal;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<emp.name<<endl;
  cout<<"ID of the Employee : "<<emp.id<<endl;
  cout<<"Age of the Employee : "<<emp.age<<endl;
  cout<<"Designation of the Employee : "<<emp.desg<<endl;
  cout<<"Salary of the Employee : "<<emp.sal<<endl; 
  return 0;
}