#include <bits/stdc++.h> 
using namespace std; 
  
// Function to find the area 
// of the biggest circle 
float circlearea(float l, float b) 
{ 
  
    // the length and breadth cannot be negative 
    if (l < 0 || b < 0) 
        return -1; 
  
    // area of the circle 
    if (l < b) 
        return 3.14 * pow(l / 2, 2); 
    else
        return 3.14 * pow(b / 2, 2); 
} 
  
// Driver code 
int main() 
{ 
    float side, rad;
  	cin>>rad>>side;
    if(circlearea(side,side) >= 3.14 * rad * rad)
      cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
    return 0; 
} 