#include<iostream>
#include<string>
#include<cctype>
using namespace std;
bool isVowel(char ip)
{
  switch(ip)
  {
    case 'a': case 'e': case 'i':case 'o':case'u': return true; 
    default: return false;
  }
}
int main()
{
 	string ip;
  int i;
  getline(cin,ip);
  for(i=0;i<ip.length();i++)
  {
    if(isalpha(ip[i]))
    ip[i] = tolower(ip[i]);
  }
  int vow=0,con=0,ws=0,dig=0,sym=0;
  for(i=0;i<ip.length();i++)
      {
 		 if((isalpha(ip[i])) && isVowel(ip[i]))
            vow++;
         else if((isalpha(ip[i])) && !(isVowel(ip[i])))
            con++;
         else if(isdigit(ip[i]))
            dig++;
         else if(ip[i]==' ')
            ws++;
         else
            sym++;
  	}
  cout<<"Vowels:"<<vow<<endl<<"Consonants:"<<con<<endl<<"White Spaces:"<<ws<<endl<<"Digits:"<<dig<<endl<<"Symbols:"<<sym;
  return 0;
      }