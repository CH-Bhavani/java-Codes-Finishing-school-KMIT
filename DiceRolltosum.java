/*
You have d dice, and each die has f faces numbered 1, 2, ..., f.
Return the number of possible ways (out of fd total ways) modulo 10^9 + 7 to roll the dice so the
sum of the face up numbers equals target.

Example 1:
Input: d = 1, f = 6, target = 3
Output: 1
Explanation: 
You throw one die with 6 faces.  There is only one way to get a sum of 3.


input =
1 6 3
output = 1
first read d value, followed by f value and target value


Example 2:
2 6 7
output =6

d = 2, f = 6, target = 7
Output: 6
Explanation: 
You throw two dice, each with 6 faces.  There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.

Example 3:
input =2 5 10
output =1

d = 2, f = 5, target = 10
Output: 1
Explanation: 
You throw two dice, each with 5 faces.  There is only one way to get a sum of 10: 5+5.

Example 4:
Input: d = 1, f = 2, target = 3
Output: 0
Explanation: 
You throw one die with 2 faces.  There is no way to get a sum of 3.

*/




import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(numRollsToTarget(n,k,t));
    }
 public static int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for(int t = j; t <= Math.min(target, k * i); t++) {
                    dp[i][t] = (dp[i][t] + dp[i - 1][t - j]) % 1_000_000_007;
                }
            }
        }
        return dp[n][target];
    }
}
