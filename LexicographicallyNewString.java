/*

Ramu is playing with two strings s1 and s2. he wants to construct the newString in the following way.

   -- if s1 is not empty append the first character in s1 to newString and delete it from s1.
     example: if s1=abc and newString=de, then after choosing this operation, s1=bc and newString =dea
   -- if s2 is not empty append the first character in s2 to newString and delete it from s2.
      example: if s2=abc and newString="" then after choosing this operation, 
      s2=bc and newString= a
  Note: return the lexicographically largest newString ramu need to construct

example 1:
intput =
cabaa
bcaaa
output =cbcabaaaaa

 
Explanation: One way to get the lexicographically largest newString is:
- take from s1: newString = "c", s1 = "abaa", s2 = "bcaaa"
- Take from s2: newString = "cb", s1 = "abaa", s2 = "caaa"
- Take from s2: newString = "cbc", s1 = "abaa", s2 = "aaa"
- Take from s1: newString = "cbca", s1 = "baa", s2 = "aaa"
- Take from s1: newString = "cbcab", s1 = "aa", s2 = "aaa"

- Append the remaining 5 a's from s1 and s2 at the end of newString.

    
input= abcabc
abdcaba
output =abdcabcabcaba


*/




import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb1=new StringBuilder(sc.next());
        StringBuilder sb2=new StringBuilder(sc.next());
        System.out.println(lexicographically_largest_newString(sb1,sb2));
    }
    public static String lexicographically_largest_newString(StringBuilder sb1,StringBuilder sb2){
        int i=0,j=0;
        StringBuilder nsb=new StringBuilder();
        while(sb1.length()!=0 || sb2.length()!=0){
            if( sb1.length()!=0 && sb1.toString().compareToIgnoreCase(sb2.toString())>0){
                nsb.append(sb1.charAt(0));
                sb1.deleteCharAt(0);
            }
            else if (sb2.length()!=0 && sb1.toString().compareToIgnoreCase(sb2.toString())<0){
                nsb.append(sb2.charAt(0));
                    sb2.deleteCharAt(0);
            }
            else if(sb2.length()!=0 || sb2.length()!=0){
                nsb.append(sb1.substring(i));
                nsb.append(sb2.substring(j));
                break;
            }
        }
        return nsb.toString();
    }
}
