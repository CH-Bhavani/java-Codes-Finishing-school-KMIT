/*

Rakesh is printing longest increasing subsequence from the group of integers.
Help him to find the length of subsequence.

input =8
10 9 2 5 3 7 101 18
output =4
Explanation: 2 3 7 101 is the longest increasing subsequence is so print length 4.

Example 2:
input =6
0 1 0 3 2 3
output =4

input =7
7 7 7 7 7 7 7
output =1



*/


import java.util.*;
class Solution {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(lengthOfLIS(arr));
    }
}
