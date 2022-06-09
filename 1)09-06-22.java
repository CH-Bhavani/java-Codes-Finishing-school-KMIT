/*
Given an array of numbers print the starting index and ending index of the given element
Note: elements are in sorted order
      print -1 -1 if the element is not found.
      implement algorith with O(log n) runtime complexity.

example:
input =6
5 7 7 8 8 10
8
output =3 4
8 is at 3rd index started  and ended at 4th index 


input =8
1 2 4 4 4 4 6 7 
output =2 5

input =8
1 2 4 4 4 4 6 7
8
output =-1 -1



*/

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ele=sc.nextInt();
        int left=FindStartingIndex(arr,ele);
        int right=FindEndingIndex(arr,ele);
        System.out.println(left+" "+right);
    }
    public static int FindStartingIndex(int[] arr,int ele){
        int l=0,r=arr.length-1,ind=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=ele)
                r=mid-1;
            else
                l=mid+1;
            if(arr[mid]==ele)
                ind=mid;
        }
        return ind;
        
    }
    public static int FindEndingIndex(int[] arr,int ele){
        int l=0,r=arr.length-1,ind=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=ele)
                l=mid+1;
            else
                r=mid-1;
            if(arr[mid]==ele)
                ind=mid;
                
        }
        return ind;
    }
    
    
    
    
}
