/*Tubby a UKG Student has given a group of letters and His madam asked to see if the group of 
letters consists of every letter in the English Aplhabet(a-z/A-Z)

print true if it contains else print false

Note: The input can contain whitespaces.


Sample Test Case -1 

input =The quick brown fox jumps over the lazy dog 
output = true 

Explanation 
The given input line Contains all the characters from ‘a’ to ‘z’ or 'A' to 'Z'
 

Sample Test Case -2 

input =ThequickBrownfoxjumpsOverThelazy doG 
output = true 

Explanation 
The given input line Contains all the characters from ‘a’ to ‘z’ or 'A' to 'Z' 

Sample Test Case - 3

input =AbcEfghuIJkzlMnOpqrsTuvWxyD
output = true

Explanation 
The given input line Contains all the characters from ‘a’ to ‘z’ or 'A' to 'Z' */
import java.util.*;
public class alphabet{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Checkforallalpha(s));
}
    public static boolean Checkforallalpha(String str){
        int index=0;
        boolean[] vis=new boolean[26];
        for(int i=0;i<str.length();i++){
            //System.out.println(str.charAt(i));
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            index=str.charAt(i)-'a';
            }
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            index=str.charAt(i)-'A';
            }
            vis[index]=true;
        }
        for(int j=0;j<26;j++){
            if (!vis[j])
            return false;
        }
        return true;
    }
}
