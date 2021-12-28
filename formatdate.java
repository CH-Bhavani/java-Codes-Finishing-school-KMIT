/*
Shyam is given a sentence and asked him to check if it is the same reading from both sides or not. If it is same print true else print false


Note - Assume the input line here is not case sensitive
ignore the special symbols,spaces and compare only the characters and print true or false


input =a man a plan a canal panama
output = 1

in the above  example first character is 'a' last character is 'a'
second character is 'm' last second character is 'm' and comparing so on all characters should be equal


input =do nine men interpret nine men i nod
output = true

input =Red rum, sir, is murder
output = true 

input = Was it a cat I saw?
output = true

input =Eva,   can I s e e b^% e e s i n a ca;;;ve?
output = true 

input =No lemon, no melon
output = true 


*/


import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(checkforpalindrome(str));
    }
    public static boolean checkforpalindrome(String str){
        LinkedList<Character> stack =new LinkedList<>();
        StringBuilder StringNoPunctutation =new StringBuilder(str.length());
        String lowercase=str.toLowerCase();
        //System.out.println(lowercase);
        for(int i=0;i<lowercase.length();i++){
            if(lowercase.charAt(i)>='a' && lowercase.charAt(i)<='z'){
                StringNoPunctutation.append(lowercase.charAt(i));
                stack.push(lowercase.charAt(i));
            }
        }
        //System.out.println(StringNoPunctutation.toString());
        StringBuilder reversed =new StringBuilder(stack.size());
        while(!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString().equals(StringNoPunctutation.toString());
    }
}





