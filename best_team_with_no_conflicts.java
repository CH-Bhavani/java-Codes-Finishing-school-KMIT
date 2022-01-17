/*



The FS Faculty  wants to send one of his best coding group to  a Coding competition
There are several groups of coding students. 
He has the marks of the students who have attended fs classes so far. 
He wants to choose the group of students with the highest overall marks.
The marks of the students is the sum of marks of all the students in the group. 

However, the coding groups is not allowed to have issues. 
A issue exists if a younger coder has a strictly higher marks than an older coder. 
A issue does not occur between coders of the same age.

Given two lists, marks and ages , where each marks[i] and ages[i] represents the marks and age of the
i coder, respectively, return the highest overall marks of all possible coding groups

The first line of input containts the marks followed by ages of the students 

input=1 3 5 10 15
1 2 3 4 5
output=34

Explanation: You can choose all the students. 


Input= 4 5 6 5 
2 1 2 1
Output = 16

Explanation: It is best to choose the last 3 coders. 
Notice that you are allowed to choose multiple students of the same age.



Input= 1 2 3 5
8 9 10 1
Output= 6
Explanation: It is best to choose the first 3 coders.



*/

import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s1=sc.nextLine().split(" ");
        String[] s2=sc.nextLine().split(" ");
        int [] s=new int[s1.length];
        for(int i=0;i<s1.length;i++)
            s[i]=Integer.valueOf(s1[i]);
        int [] a=new int[s2.length];
        for(int i=0;i<s2.length;i++)
            a[i]=Integer.valueOf(s2[i]);
        int res=bestgroup(s,a);
        System.out.println(res);
    }
    public  static int bestgroup(int[] scores, int[] ages) {
        int[][] players = new int[scores.length][2];
        for(int i = 0;i<players.length;i++){
            players[i] = new int[]{scores[i],ages[i]};
        }
        Arrays.sort(players, (p1,p2)->(p1[1]==p2[1]?p1[0]-p2[0] :p1[1]-p2[1] ));
        return best(players);
    }
   
    private static int best(int[][] players){
        int[] dp = new int[players.length];
        dp[0] = players[0][0];
        int max = dp[0];
        for(int i = 1;i<dp.length;i++){
            dp[i] = players[i][0];
            for(int j=0;j<i;j++){
                if(players[j][0]<=players[i][0]){
                    dp[i] = Math.max(dp[i],dp[j]+players[i][0]);
                }
                else if(players[j][1]==players[i][1] ){
                    dp[i] = Math.max(dp[i],dp[j]+players[i][0]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max; 
    }
}
    
