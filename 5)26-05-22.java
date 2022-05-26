/*

You are given an integer array bags where the ith bag contains bags[i] balls. 
You are also given an integer maxOperations.

You can perform the following operation at most maxOperations times:

Take any bag of balls and divide it into two new bags with a positive number of balls.
For example, a bag of 5 balls can become two new bags of 1 and 4 balls, or two new bags of 2 and 3 balls

Your penalty is the maximum number of balls in a bag. 
You want to minimize your penalty after the operations.

Return the minimum possible penalty after performing the operations.

Example 1:
input =1
9
2
bags = [9], maxOperations = 2
output = 3
Explanation:
- Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -> [6,3].
- Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -> [3,3,3].
The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.

Example 2:
input =4
2 4 8 2
4
output =2

bags = [2,4,8,2], maxOperations = 4
output: 2
Explanation:
- Divide the bag with 8 balls into two bags of sizes 4 and 4. [2,4,8,2] -> [2,4,4,4,2].
- Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,4,4,4,2] -> [2,2,2,4,4,2].
- Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,4,4,2] -> [2,2,2,2,2,4,2].
- Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,2,2,4,2] -> [2,2,2,2,2,2,2,2].
The bag with the most number of balls has 2 balls, so your penalty is 2 an you should return 2.

Example 3:
input =2
7 17
2
output =7

Input: bags = [7,17], maxOperations = 2
Output: 7




*/


import java.util.*;
public class test {
    static int c =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((highestPowerof2(n)%2==0)?"Crisna":"Shiva");
    }
    static int highestPowerof2(int n)
    {
        int res=0;
        for(int i=n; i >= 1;i--)
        {
            if((i &(i-1))==0)
            {
                res = i; 
                break;
            }
        }
        if(n==1) return c;
        if(res==n){ c++;
            return highestPowerof2(n/2); }
        if(res<n) {  c++;
            return highestPowerof2(n-res);}
        return -1;
     }
}
