/*

Sri ,one day while travelling back to home from office during a rainy season,noticed that
rainwater is not preserved and use to rather left for wasted. So he wanted to build a system
where the rainwater can be trapped, and the system should have abitlity to compute how much rain
water is trapped.

Let's assume their a bunch of bars [grey] show the below elevation map. Each bar width is 1.
Rainwater is trapped between the grey bars compute. How much water it can be trap after raining?
The elevation map is represent by array[0,1,0,2,1,0,1,3,2,1,2,1].

In this case, 6 unit of rainwater are being trapped.

Explanation:
Count only the blue section as each bar width contains "1" value
Count 1+1+2+1+1=6

Sample Input :
12
0 1 0 2 1 0 1 3 2 1 2 1
Sample Output
6

input =6
4 2 0 3 2 5
output =9

case = 3
input =3
2 0 2



*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
        System.out.println(RainWaterTrapping(a));
    }
public static int RainWaterTrapping(int[] nums){
    int n=nums.length;
    int [] left = new int[n], right = new int[n];
     left[0] = nums[0];

     for (int i = 1; i < n; i++) {
         left[i] = Math.max(left[i-1],nums[i]);
     }
    right[n-1] = nums[n-1];
    for (int i = n-2; i >= 0; i--) {
        right[i] = Math.max(right[i+1],nums[i]);
    }
    int water = 0;
    for (int i = 0; i < n; i++) {
        water += Math.min(right[i],left[i]) - nums[i];
    }
    return water;
}
}
