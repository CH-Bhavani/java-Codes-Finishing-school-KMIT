/*



Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
return a sorted array of only the integers that appeared in all three arrays in increasing order

For any other Boundary Conditions Print -1 
Assume all the three input array contains positive elements 

The first line of input contains the first array elements followed by second array elements followed by third array elements 

input =
1 2 3 4 5 11 15
1 2 5 7 
1 3 4 5 8 20 45 55
output = 
1 5

Explanation: Only 1 and 5 appeared in the three arrays.


input = 
3 4 4 5 6 7
40 50 60 70 80 90
500 600
output = -1


input = 
1 1 1 2
1 1 
1 2 3 4 5
output = 1


*/

import java.util.*;
public class test{
    public static void main(String [] args ){
        Scanner sc=new Scanner (System.in);
        String[] str1=sc.nextLine().split(" ");
        String[] str2=sc.nextLine().split(" ");
        String[] str3=sc.nextLine().split(" ");
        List arr1=Arrays.asList(str1);
        List arr2=Arrays.asList(str2);
        List arr3=Arrays.asList(str3);
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<str1.length;i++){
            String s=str1[i];
            if(arr2.contains(s) && arr3.contains(s))
                arr.add(s);
        }
        if(arr.size()==0)
            System.out.println(-1);
        else
            for(String j: arr){
                System.out.print(j+" ");
        }
    }
}
