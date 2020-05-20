#include<iostream>
#include<cmath>
#include<cstdio>
using namespace std;
int main()
{
  int balls, total_runs, scored_runs, balls_bowled;
  cin>>balls>>total_runs>>scored_runs>>balls_bowled;
  int overs = balls/6;
  int bowled_overs = balls_bowled/6;
  int bowled_overs_balls = balls_bowled%6;
  
  float current_runrate = scored_runs/(bowled_overs + (0.1 * bowled_overs_balls));
  float total_runrate = float(total_runs) / float(overs);
 
  
  cout<< overs<<'\n'<<bowled_overs<<'.'<<bowled_overs_balls<<'\n';
  printf("%.1f\n",current_runrate);
  printf("%.1f\n",total_runrate);
  
  if(current_runrate>total_runrate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
  
  
}