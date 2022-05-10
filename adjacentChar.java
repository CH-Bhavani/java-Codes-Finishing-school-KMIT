/*


kapoor's have brought a tiny kitten in their house. Everybody is excited to give her a name.
but Mr.kapoor has a condition for the name ie there should be no duplicate adjacent character in the name.
but relatives were not aware of this condition and they have already sent some names.

Now your task is to minimize the given name according to the condition so that it can be accepted by mr.kapoor.

example: 
input =cherreis
output =chis

in cherreis first rr is removed, now the string is cheeis again 2 duplicate e's are coming, so after removing it output is chis, which can't be minimized further.

if final output is empty return -1.


*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(noDup(s));
    }
    public static String noDup(String s){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && stk.peek()==s.charAt(i))
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stk)
            sb.append(c);
        return sb.length()==0?"-1":sb.toString();
    }
}

