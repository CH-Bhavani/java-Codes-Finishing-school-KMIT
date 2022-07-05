/*

Aziz is given a set of integers SOI[], consists of both +ve and -ve integers.

Aziz wants to find the maximum sum of contiguous subset of the SOI, with a twist.

You have to perform the following operation before finding the maximum sum:
	- You are allowed to replace exactly one integer X, with its square value ( X * X).

Can you please help Aziz to find out the maximum sum of contiguous subset.


Input Format:
-------------
Single line of space separated integers, values of the array.

Output Format:
--------------
Print an integer value as result.


Sample Input-1:
---------------
-5 -3 1 2 -3 4 -4 3

Sample Output-1:
----------------
26

Explanation:
------------
max sum is: (-5)^2 + (-3) + 1 + 2 + (-3) + 4 = 26


Sample Input-2:
---------------
2 -2 2 2 -2 -2 2

Sample Output-2:
----------------
10

Explanation:
------------
max sum is: 2 +(-2)^2 + 2 + 2 = 10




*/

import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.valueOf(s[i]);
        }
        System.out.println(SubarraySum(arr,n));
    }
    public static int SubarraySum(int[] a,int n){
        int dp[][] = new int[n][2];
        dp[0][0] = a[0];
        dp[0][1] = a[0] * a[0];
        int max_sum = Math.max(dp[0][0], dp[0][1]);
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(a[i], dp[i - 1][0] + a[i]);
            dp[i][1] = Math.max(dp[i - 1][1] + a[i],a[i] * a[i]);
            dp[i][1]= Math.max(dp[i][1],dp[i - 1][0] + a[i] * a[i]);
            max_sum = Math.max(max_sum, dp[i][1]);
            max_sum = Math.max(max_sum, dp[i][0]);
        }
        return max_sum;
        
    }
}
