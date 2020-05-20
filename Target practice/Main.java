#include <cstdio>
int main()
{
    int n,a,i=0,c=0,s=0;
    scanf("%d",&n);
    do
    {
        c++;
        scanf("%d",&a);
        s+=a;
        i++;
    }
    while(s<n);
    printf("The number of turns is %d",c);
    return 0;
}