/*

Ramesh is playing a online game with 45 Levels.

In Each time ramesh can play one or 2 levels. 

In how many distinct ways can ramesh reach the given level

ex:
input =2
output =2

two ways to reach the top Level(here top level is 2)
using 
one way to reach top level is playing     Level-1 +Level-2 separetly
second way to reach top level is playing  Level-1& 2 at time


ex: 
input =3
output =3
there are three ways to reach the top level
1) level-1 + level-2 +level-3
2) level-1 + level-2 and level-3 at time
3) level-1 & level2 at time and level-3




*/




import java.util.*;
class test
{
    static int count=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getSteps(n+1,new int[n+2]));
    }
    public static int getSteps(int n,int dp[])
    {
        if(n==0||n==1)
            return n;
        if(dp[n]>0)
        return dp[n];
        
        return dp[n]=getSteps(n-1,dp)+getSteps(n-2,dp);
    }
}
