/*
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.


Example 1:
input =4
1 3 5 6
5
output =2


input =4
1 3 5 6
2
output =1


*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(findtargetpos(arr,n,tar));
    }
    public static int findtargetpos(int[] arr,int n, int tar){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==tar|| arr[i]>tar) return i;
        }
        return i;
    }
}
