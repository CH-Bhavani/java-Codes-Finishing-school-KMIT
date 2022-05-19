/*


??Given array with 0's and 1's, your task is to find out the number of contiguous
arrays can be formed ,which contains more number of the 1's


input =5
1 0 1 1 0
output =9

Explanation:
------------
The Contiguous subarrays having more ones than zeros are as follows:
with size-1: [1], [1], [1]
With size-2: [1,1]
With size-3: [1,0,1], [0,1,1], [1,1,0]
With size-4: [1,1,0,1]
With size-5: [1,1,0,1,0]


*/


import java.util.*;
public class test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subArray1(arr,n));
    }
    public static int subArray1(int [] arr,int n){
        int count1,sub=0;
        for(int i=0;i<n;i++){
            count1=0;
            for(int we=i;we<n;we++){
                if(arr[we]==1)
                    count1++;
                if(we-i+1-count1<count1){
                     sub++;
                }
            }
        }
        return sub;
    }
}
