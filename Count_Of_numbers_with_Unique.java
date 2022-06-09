/*
Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10power of n.


input = 0
output =1

input =1
output =10

input =2
output =91

the total numbers in the range of 0 ≤ x < 100, excluding 11,22,33,44,55,66,77,88,99
so 100-9 is 91


*/
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Count(n));
    }
    public static int Count(int n){
        if(n==0)
            return 1;
        int res=10,start=9,current=9;
        while(n-->1){
            current*=(start--);
            res+=current;
        }
        return res;
    }
    
}
