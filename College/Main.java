#include <iostream>
#include <string>
using namespace std;
struct college
{
    string name, city, yoe, pp;
};

int main()
{
    int n, i;
    cout << "Enter the number of colleges\n";
    cin >> n;
    college clg[n];
    for (i = 0; i < n; i++)
    {
        cout << "Enter the details of college " << i + 1 << "\n";
        cout << "Enter name\n";
        cin.ignore(32767, '\n');
        getline(cin, clg[i].name);
        cout << "Enter city\n";
        getline(cin, clg[i].city);
        cout << "Enter year of establishment\n";
		cin >> clg[i].yoe;
        cout << "Enter pass percentage\n";
		cin >> clg[i].pp;
    }
    cout << "Details of colleges\n";
    for (i = 0; i < n; i++)
    {
        cout << "College:" << i + 1 << endl;
        cout << "Name:" << clg[i].name << endl;
        cout << "City:" << clg[i].city << endl;
        cout << "Year of establishment:" << clg[i].yoe << endl;
        cout << "Pass percentage:" << clg[i].pp << endl;
    }
    return 0;
}