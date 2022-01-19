/*



Gopal is given a string s, Now he has to remove duplicate letters so that every letter appears once and only once.

He must make sure that the result produces should occur in the order given in string 

Example 1:

Input = bcabc
Output = bca



*/


import java.util.*;
class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(remove_duplicates(str));
    }
    public static String remove_duplicates(String s){
        ArrayList<Character> arr=new ArrayList<>();
        String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!arr.contains(c)){
                arr.add(c);
                s1+=c;
            }
        }
        return s1;
    }
}
