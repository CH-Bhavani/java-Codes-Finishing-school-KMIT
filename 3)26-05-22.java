/*
You are given  a single line of strings separated by space . 
You need to arrange them lexicographically. 
A lexicographical order is the dictionary order.


Input contains a single line of strings in a space separated manner.
String contains only uppercase English letters.
Output
Print the sorted array.


input =ASH AAB JKR FTE
output =AAB ASH FTE JKR



*/


import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []s=sc.nextLine().split(" ");
        Arrays.sort(s);
        for(String i:s)
        System.out.print(i+" ");
    }
}
