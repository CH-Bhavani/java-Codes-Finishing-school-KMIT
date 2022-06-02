/*1 Ravi is playing with string, return the number of similar substrings of s.
    2 
    3 similar substring means if all the characters of the substrings are the same
    4 
    5 example:
    6 input = bccdddbb
    7 Explanation: The similar substrings are listed as below:
    8 "b"   appears 3 times.
    9 "bb"  appears 1 time.
   10 "c"   appears 2 times.
   11 "cc"  appears 1 time.
   12 "d"   appears 3 times.
   13 "dd"  appears 2 times.
   14 "ddd" appears 1 time.
   15 3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
   16 
   17 output =13
   18 
   19 input =ab
   20 output =2
   21 similar substrings are a and b
   22 
   23 
   24 input =sssss
   25 output =15
   26 
   27 Note: answer may be too large, return it modulo 10^9+7
   28 
     
     
     */
test.java
    1 import java.util.*;
    2 public class test{
    3     public static void main(String[] args){
    4         Scanner sc=new Scanner(System.in);
    5         String s=sc.next();
    6         System.out.println(SimilarSubstrings(s));
    7     }
    8     public static int SimilarSubstrings(String s){
    9         int ws=0,sum=0,i;
   10         for(i=0;i<s.length()-1;i++){
   11             if(s.charAt(i)!=s.charAt(i+1))
   12                 {
   13                     int len=i-ws+1;
   14                     sum+=len*(len+1)/2;
   15                     ws=i+1;
   16                     //System.out.println(i+"  "+ws+"  "+sum);
   17                 }
   18         }
   19         if(ws<s.length()){
   20             int len=i-ws+1;
   21             sum+=len*(len+1)/2;
   22         }
   23         return sum;
   24     }
   25 }
