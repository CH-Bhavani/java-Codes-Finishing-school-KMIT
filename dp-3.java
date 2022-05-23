/*

Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

input =3 4
0 1 1 1
1 1 1 1
0 1 1 1
output =15

Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.


Example 2:
input =3 3
1 0 1
1 1 0
1 1 0
output =7

Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.
 

*/

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        int dp[][]=new int[n+1][m+1];
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0||j==0)
                dp[i][j]=arr[i][j];
                else if(arr[i][j]==1&&i>0&&j>0)
                {
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
                res+=dp[i][j];
            }
        }
        System.out.println(res);
        
    }
}
