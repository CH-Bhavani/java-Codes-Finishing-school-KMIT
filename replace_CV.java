/*
CV Game

Somu is playing a game. The Game Rules are as follows 

A word will be given, where Ramu has to replace the letters of the word with V/C
If the letter is a vowel it will be de denoted by upper case letter ‘V’ and a 
if the letter is a consonant it will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Letters will be only(a-z/A-Z)

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV 
*/



import java.util.*;
public class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(replace_VC(s));
    }
    public static String replace_VC(String str){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            if (is_vowel(str.charAt(i))){
                if (sb.toString().length()==0){
                    sb.append("V");
                    count++;
                }
                else{
                    if(!String.valueOf(sb.charAt(count-1)).equals("V")){
                        sb.append("V");
                        count++;   
                    }
                }
            }
        
            else{
                if(sb.toString().length()==0){
                    sb.append("C");
                    count++;
                }
                else{
                    if(!String.valueOf(sb.charAt(count-1)).equals("C")){
                        sb.append("C");
                        count++;
                    }
                }
            }
        }
    return sb.toString();
    }
    public static boolean is_vowel( char c){
        if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'||c=='A' ||c=='E' ||c=='I' 
        ||c=='O' || c=='U')
            return true;
        return false;
    }
}
