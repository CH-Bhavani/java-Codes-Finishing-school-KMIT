/*



Given an array nums with n objects three chocolates, cadbury , nestle, amul, sort them 
in-place so that objects of the same kind of chocolates are adjacent, 
with the type in the order cadbury , nestle , amul

you must solve the problem without using library's sort funtion.

ex:
input = 6
amul cadbury amul nestle nestle cadbury
output =cadbury cadbury nestle nestle amul amul

input =3
amul cadbury nestle
output =cadbury nestle amul



*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        //System.out.println(Arrays.toString(arr));
        sort(arr,n);
    }
    public static void sort(String[] arr,int n){
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid].equals("cadbury")){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid].equals("amul")){
                swap(arr,mid,high);
                high--;
            }
            else
                mid++;
        }
        for(String s:arr){
            System.out.print(s+" ");
        }
    }
    public static void swap(String[] arr,int i,int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
