#include <iostream>
using namespace std;
int main()
{
    float flipkart[4], snapdeal[4], amazon[4];
    cin >> flipkart[0] >> flipkart[1] >> flipkart[2];
    cin >> snapdeal[0] >> snapdeal[1] >> snapdeal[2];
    cin >> amazon[0] >> amazon[1] >> amazon[2];

    flipkart[3] = flipkart[0] - ((flipkart[1] / 100) * flipkart[0]) + flipkart[2];
    snapdeal[3] = snapdeal[0] - ((snapdeal[1] / 100) * snapdeal[0]) + snapdeal[2];
    amazon[3] = amazon[0] - ((amazon[1] / 100) * amazon[0]) + amazon[2];

    cout << "In Flipkart Rs." << flipkart[3] << '\n';
    cout << "In Snapdeal Rs." << snapdeal[3] << '\n';
    cout << "In Amazon Rs." << amazon[3] << '\n';

    if (flipkart[3] <= amazon[3] && flipkart[3] <= snapdeal[3])
        cout << "He will prefer Flipkart";
    else if (snapdeal[3] <= flipkart[3] && snapdeal[3] <= amazon[3])
        cout << "He will prefer Snapdeal";
    else
        cout << "He will prefer Amazon";
    return 0;
}