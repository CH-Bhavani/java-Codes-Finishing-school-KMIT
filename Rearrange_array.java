/*

you are given an array of integers with positive and negative numbers.

you should rearrange the elements of integers based on below conditions:
-- every consecutive pair of integers have alternate signs.
-- the output array begins with a positive integer.


example:

input =6
3 1 -2 -5 2 -4
output =3 -2 1 -5 2 -4


input = 2
-1 1
output =1 -1


*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        rearrange_array(arr,n);
    }
    public static void rearrange_array(int[] arr,int n){
        int outofIndex = -1;
        for (int ind = 0; ind < n; ind++) {
            if (outofIndex >= 0) {
                if ((arr[ind] >= 0 && arr[outofIndex] < 0) || (arr[ind] < 0 && arr[outofIndex] >= 0))
                { rightrotate(arr, n, outofIndex, ind);
                if (ind - outofIndex >= 2)
                    outofIndex += 2;
                else
                    outofIndex = -1;
            }
            }
            if (outofIndex == -1) {
                if (((arr[ind] >= 0) && ((ind %2) == 1)) || ((arr[ind] < 0) && (ind%2 == 0)))
                    outofIndex = ind;
            }
        }
        for(int a:arr) System.out.print(a+" ");
    }
    public static void rightrotate(int[] arr,int n,int oop,int cur){
        int temp=arr[cur];
        for(int i=cur;i>oop;i--){
            arr[i]=arr[i-1];
        }
        arr[oop]=temp;
    }
    
}
