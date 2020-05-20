#include <iostream>
using namespace std;

int main()
{
    int n, t1 = 0, t2 = 1, nextTerm = 0;

    cin >> n;
    n-=2;


    for (int i = 1; i <= n; ++i)
    {
        
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
        
    }
  cout<< "The term "<<n+2<<" in the fibonacci series is "<<nextTerm;
    return 0;
}