/*Shyam has given a word from the Dictionary and he has to encode the word by 
only reversing the letters of the word ignoring other letters.

Only the letters(a-z/A-Z)/0-9)has to be encoded not other letters 

Sample Test Case -1

input = a&b*c$rt
output = t&r*c$ba

Explanation - 

From the above test case we have a,b,c,r,t as the alphabets 
and reversing only this characters without disturbing other characters we will have 
t&r*c$ba as the output

Sample Test Case -2

input = a&b$c#d
output = d&c$b#a
*/



import java.util.*;
public class encode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(encodedString(str));
    }
    public static String encodedString(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c))
            st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c))
            sb.append(st.pop());
            else
            sb.append(c);
            
        }
        return sb.toString();
    }
}
