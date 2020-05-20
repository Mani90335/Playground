#include<iostream>
#include<string.h>
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};
int main()
{
  int n,i=1,j;
  cout<<"Enter the number of students\n";
  cin>>n;
  Student s[10],t;
  while(i<=n)
  {
  cout<<"Enter the details of student "<<i<<"\n";
  cout<<"Enter name\n";
  cin>>s[i].name;
  cout<<"Enter department\n";
  cin>>s[i].department;
  cout<<"Enter year of study\n";
  cin>>s[i].yearOfStudy;
  cout<<"Enter cgpa\n";
  cin>>s[i].cgpa;
    i++;
  }
  for(i=1;i<=n;i++)
     {
          for(j=i+1;j<=n;j++)
          {
               if(strcmp(s[i].name,s[j].name)>0)
               {
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
               }
          }
     }
    cout<<"Details of students\n";
for(i=1;i<=n;i++)
{

  cout<<"Student "<<i<<"\n";
  cout<<"Name:"<<s[i].name<<"\n";
  cout<<"Department:"<<s[i].department<<"\n";
  cout<<"Year of study:"<<s[i].yearOfStudy<<"\n";
  cout<<"CGPA:"<<s[i].cgpa<<"\n";
}
  
  
}