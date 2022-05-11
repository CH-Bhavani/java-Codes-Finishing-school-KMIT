/*


Given two strings a and b, return the minimum number of times you should repeat string a so that 
string b is a substring of it. If it is impossible for b to be a substring of a after repeating it,
return -1.

Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is 
"abcabc".

 

Example 1:
input =abcd
cdabcdab
output =3

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times of a ie abcd is "abcdabcdabcd", b ie cdabcdab is a 
substring of it.



Example 2:
input =a
aa
output =2



*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(count(s1,s2));
    }
    public static int count(String s1,String s2){
        String s=s1;
        int count=1;
        int n=s2.length()/s1.length()+1;
        for(int i=1;i<=n;i++){
            if(s1.contains(s2))
                return count;
            else{
                s1=s1+s;
                count++;
            }
        }
        return -1;
    }
}
