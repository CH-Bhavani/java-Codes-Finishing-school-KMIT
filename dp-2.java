/*

ADP project leader assigning n employees to projects,each project can have atmost 2 employees , 
i.e. either the project has one employee or two employees only, not more than that.
Each employee can remain single in project or can be paired up with some other employee for one project . 
Each  employee can be paired only once. Find out the total number of ways in which employees can remain single
or can be paired up for that project. 

Examples: 

input = 3
output = 4
Explanation:
{A}, {B}, {C}  all individual employees can take single for separate project.
{A}, {B, C}   B and C paired together take as single project but A can take separate project.
{A, B}, {c} : A and B are paired together take as single project  but C can take separate project.
{A, C}, {B} : A and C aare paired together take as single project but B can take separate project.
Note that {A, B} and {B, A} are considered same.

so there are four ways project leader can assign his employees


input = 2
output =2
Explanation:
{A},{B} all individual employees can take single for separate project.
{A,B}   A and B paired together take as single project
Note that {A, B} and {B, A} are considered same.


*/



mport java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getMax(n,new long[n+1]));
    }
    public static long getMax(int i,long dp[])
    {
        if(i<=2)
        return dp[i]=i;
        if(dp[i]>0)
        return dp[i];
        return dp[i]=getMax(i-1,dp)+((i-1)*getMax(i-2,dp));
    }
