/*

Given a word w, return the number of substrings with out duplicate characters of length 3 in w.

ex: 
input =xyzzaz
output =1
there are 4 substrings of size 3
xyz, yzz,zza,zaz
out of this only xyz has no duplicate characters so print 1.


ex:
input =aababcabc
ouput =4

there are 7 substrings of size 3
aab,aba,bab,abc,bca,cab,abc
from the above abc,bca,cab,abc are having unique characters.



*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(substring_of_3(s));
    }
    public static int substring_of_3(String s){
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            int[] arr=new int[26];
            int flag=1;
            String sub=s.substring(i,i+3);
            for(int j=0;j<3;j++){
                if(arr[sub.charAt(j)-'a']==1) {
                    flag=0;
                    break;
                }
                else if(arr[sub.charAt(j)-'a']==0)
                    arr[sub.charAt(j)-'a']=1;
            }
            if(flag==1) count++;
        }
        return count;
    }
}
