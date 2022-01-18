/*

Sundeep is working with integer sets.
He is given a set of integers nums[], consist of positive integers.
You have to find a subsequence of integet set nums[], where the sum of elements
is equal to the sum of the rest of the elements.

Check whether you are able to split the entire set nums[], into two subsequences
where the two subsequences never share the elements from same index.

If it is possible to split, print true.
otherwise print false.

The first line of input contains the size followed by array elements 

Sample Input-1:
---------------
4
4 2 8 6

Sample Output-1:
----------------
true

Explanation:
----------
[4,6] and [2,8] sum of both the sets equal to 10.


Sample Input-2:
---------------
5
2 3 4 5 8

Sample Output-2:
----------------
false




*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(equal_sum_set(arr,n));
    }
    public static boolean equal_sum_set(int[] arr,int n ){
        int sum=0;
        for(int a:arr)
            sum+=a;
        if (sum%2==1)
            return false;
        sum=sum/2;
        HashSet<Integer> hs=new HashSet<>();
        hs.add(0);
        for(int a:arr){
            List<Integer> ls=new ArrayList<>(hs);
            for(int l:ls){
                if(l+a==sum)return true;
                else if(l+a<sum) hs.add(l+a);
            }
        }
        return false;
    }
        
}



