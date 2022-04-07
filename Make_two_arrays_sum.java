/*
Rakesh is playing a game with two arrays called  array1 and array2 of single digit numbers of range 1 to 6.
In each step rakesh can change any value of any array in range of 1 to 6. 
return the minimum number of steps to make the sum of values in array1 equal to sum of values in array2
otherwise print -1, if it is not possible to make the sum of two arrays equal

Note:  array1 and array2 possibly of different lengths.

input =6
1 2 3 4 5 6
6
1 1 2 2 2 2
output =3


Rakesh can make  the sums of array1 and array2 equal with 3 operations.
- Change array2[0] to 6. array1 = [1,2,3,4,5,6], array2 = [6,1,2,2,2,2].
- Change array1[5] to 1. array1 = [1,2,3,4,5,1], array2 = [6,1,2,2,2,2].
- Change array1[2] to 2. array1 = [1,2,2,4,5,1], array2 = [6,1,2,2,2,2].


input =7
1 1 1 1 1 1 1
1
6
output =-1
Explanation: There is no way to decrease the sum of array1 or to increase the sum of array2 to make them equal.so return -1.


input =2
6 6
1
1
output =3
Explanation: You can make the sums of array1 and array2 equal with 3 operations. All indices are 0-indexed. 
- Change array1[0] to 2. array1 = [2,6], array2 = [1].
- Change array1[1] to 2. array1 = [2,2], array2 = [1].
- Change array2[0] to 4. array1 = [2,2], array2 = [4].

Rakesh is playing a game with two arrays called  array1 and array2 of single digit numbers of range 1 to 6.
In each step rakesh can change any value of any array in range of 1 to 6. 
return the minimum number of steps to make the sum of values in array1 equal to sum of values in array2
otherwise print -1, if it is not possible to make the sum of two arrays equal

Note:  array1 and array2 possibly of different lengths.

input =6
1 2 3 4 5 6
6
1 1 2 2 2 2
output =3


Rakesh can make  the sums of array1 and array2 equal with 3 operations.
- Change array2[0] to 6. array1 = [1,2,3,4,5,6], array2 = [6,1,2,2,2,2].
- Change array1[5] to 1. array1 = [1,2,3,4,5,1], array2 = [6,1,2,2,2,2].
- Change array1[2] to 2. array1 = [1,2,2,4,5,1], array2 = [6,1,2,2,2,2].


input =7
1 1 1 1 1 1 1
1
6
output =-1
Explanation: There is no way to decrease the sum of array1 or to increase the sum of array2 to make them equal.so return -1.


input =2
6 6
1
1
output =3
Explanation: You can make the sums of array1 and array2 equal with 3 operations. All indices are 0-indexed. 
- Change array1[0] to 2. array1 = [2,6], array2 = [1].
- Change array1[1] to 2. array1 = [2,2], array2 = [1].
- Change array2[0] to 4. array1 = [2,2], array2 = [4].





*/





import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        int n=sc.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
            arr2[i]=sc.nextInt();
        System.out.println(minOperations(arr1,arr2));
    }
 public  static int minOperations(int[] nums1, int[] nums2) {
        
        int result = 0;
        int sum1 = 0;
        for(int num:nums1)
            sum1 += num;
        
        int sum2 = 0;
        for(int num:nums2)
            sum2 += num;
        
        if(sum1 == sum2 )
            return 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(sum1 > sum2)
            result = helper(nums1, nums2, sum1, sum2);
        else 
            result = helper(nums2, nums1, sum2, sum1);
        
        return result;
        
    }
    public  static int helper(int[] nums1, int[] nums2, int sum1, int sum2){
        
        int max_pointer = nums1.length -1;
        int min_pointer = 0;
         int operations_count = 0;
        
        while((max_pointer >= 0 || min_pointer < nums2.length) && sum1 > sum2){
            int diff = sum1 - sum2;
            int valueToAdd = 0;
            int valueToRemove = 0;
            if(min_pointer < nums2.length && diff > 0 && nums2[min_pointer] < 6)
            {
                valueToAdd = (6 - nums2[min_pointer]) ;
                valueToAdd = (valueToAdd > diff) ? diff: valueToAdd;
            }
            if(max_pointer >= 0 && diff > 0 && nums1[max_pointer] > 1)
            {
                valueToRemove = (nums1[max_pointer]-1);
                valueToRemove = (valueToRemove > diff) ? diff : valueToRemove;
                    
            }
            if(valueToAdd == 0 && valueToRemove == 0)
                break;
            if(valueToAdd > valueToRemove){
                sum2 += valueToAdd;
                nums2[min_pointer] += valueToAdd ;
                operations_count++;
                min_pointer++;
            }
            else
            {
                sum1 = sum1-valueToRemove;
                nums1[max_pointer] -= valueToRemove ;
                operations_count++;
                max_pointer--;
                
            } 
        }
        return (sum1 - sum2 == 0 )?operations_count:-1;
        
    }
}
