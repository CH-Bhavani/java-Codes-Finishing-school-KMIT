/*

In a Maths class, the maths teacher gives a number 'n' to students, along with the number 
she also gives another number 'k',
the students of the class are supposed to give a new number after removing the k digits 
from the given number.


Given a string ‘str’ of digits and an integer ‘n’, build the lowest possible number by removing ‘n’ digits from the string and not changing the order of input digits.

Examples: 

Input: str = "4325043", n = 3
Output: "2043"

Input: str = "765028321", n = 5
Output: "0221"

Input: str = "121198", n = 2
Output: "1118"


input = 157654
3
output=154


input=1432219
3
output=1219


*/






import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k =sc.nextInt();
        System.out.println(smallestnum(s,k));
    }
    public static String smallestnum(String s,int k){
        if(s.length()<=k) return "0";
        if(k==0) return s;
        StringBuilder sb=new StringBuilder();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(!stk.isEmpty() && k>0 && c<stk.peek()){
                stk.pop();
                k--;
            }
            if(!stk.isEmpty() || c!='0')
                stk.push(c);
        }
        while(!stk.isEmpty() && k>0){
            stk.pop();
            k--;
        }
        if(stk.isEmpty()) return "0";
        while(!stk.isEmpty())
            sb.append(stk.pop());
        return sb.reverse().toString();
        }
}
