/*
Shyam a clever boy, is good in analyzing the words given to him. 
He figures out the speciality of the word in any way. 
Given a word to Shyam, he determines few characters(consecutive) or whole word to be same from left to right and from right to left. 
Print the word which match the above pattern which has the maximum characters in it.
He considers the words which matches the above pattern, has a minimum length of 2. 

If no such word exists print -1

Now Check Shyam is correct or not by writing a code for him. 


for example:
input =abbbabbcbbacdb
output =abbcbba

input=hello
output=ll

input = abcd
output=-1

*/



import java.util.*;
public class longestpalindrome{
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int maxl=-1;
        String pali=new String();
        for(int i=0;i<str.length()+1;i++){
            for(int j=i+1;j<str.length()+1;j++){
                boolean temp=isPalindrome(str.substring(i,j));
                if(temp){
                    if(str.substring(i,j).length()>maxl)
                    pali=str.substring(i,j);
                    maxl=pali.length();
                }
            }
        }
        if (maxl==1)
            System.out.println("-1");
        else
            System.out.println(pali);
    }
    public static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
            sb.append(s.charAt(i));
        return sb.reverse().toString().equals(s);
    }
}
