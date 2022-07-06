/*
Given a bunch of baskets in a row, each basket contains few fruits in it.
You can select K number of baskets, one after other.
The selection of basket is either from beginning or from the end the row.

Return the maximum number of fruits you have after K baskets collected.

Input Format:
-------------
Line-1 -> Two integers N and K, N is no of baskets and K is the basket 
count you can pick.
Line-2 -> N space separated integers fruits[], fruits in each basket.

Output Format:
--------------
Print an integer, Maximum num of fruits you can collect.


Sample Input-1:
---------------
7 3
1 2 3 4 5 6 1

Sample Output-1:
----------------
12


Sample Input-2:
---------------
5 3
2 2 2 2 2

Sample Output-2:
----------------
6


Sample Input-3:
---------------
8 3
1 79 80 1 1 1 200 1

Sample Output-3:
----------------
202

*/
import java.util.*;
public class test{
    static int sum=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            
        }
        System.out.println(MaxFruits(arr,n,k));
        
    }
    public static int MaxFruits(int[] arr,int n,int k){
        int min=Integer.MAX_VALUE,ws=0,windowSum=0;
        for(int we=0;we<n;we++){
            windowSum+=arr[we];
            if(we-ws+1==n-k){
                min=Math.min(min,windowSum);
                windowSum-=arr[ws];
                ws++;
                
            }
            
        }
        return sum-min;
        
    }
    
}
