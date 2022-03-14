/*

Given a word w, return number of righteous subwords of length 4 in w.

A word is righteous if there are no duplicate characters.

example:
input =wxyzzaz
output =1

there are 4 sub-words with size 4: wxyz,xyzz,yzza,zzaz.
righteous subwords from the above 4 is only one wxyz with no duplicate character.


input =abcddcbaabcd
output =3

there are 9 sub-words with size 4:
abcd,bcdd,cddc,ddcb,dcba,cbaa,baab,aabc,abcd.
righteous subwords from the above 9 are three words abcd, dcba, abcd
with no duplicate character.
Note:  if there are multiple occurrences of the same subword, every occurrence should be counted.


input =abcdabcdabcd
output =9
abcd,bcda,cdab,dabc,abcd,bcda,cdab,dabc,abcd




*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=4;
        System.out.println(righteous_subwords(str,len) );
    }
    public static int righteous_subwords(String s,int l){
        int count=0;
        for(int i=0;i<s.length()-4+1;i++){
            String sub=s.substring(i,i+4);
            //System.out.println(sub+ right(sub));
            if(right(sub)){
                count++;
            }
        }
        return count;
    }
    public static boolean right(String sub){
        boolean[] alp=new boolean[26];
        for(int i=0;i<sub.length();i++){
            if(alp[sub.charAt(i)-'a']) return false;
            else 
            alp[sub.charAt(i)-'a']=true;
        }
        return true;
    }
}
