/*


Rakesh is playing a word game to read a string from the user and expand the string in the following given example.
help him to expand the string into expanded form.


example:
input =5[x]3[yz]
output =xxxxxyzyzyz


input =4[x3[y]]
output =xyyyxyyyxyyyxyyy

input =2[uvw]3[xy]z
output =uvwuvwxyxyxyz

 */
 
 
 
 import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        System.out.println(expand(word));
    }
    public static String expand(String w){
        Stack<Character> stk=new Stack();
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(c==']'){
                StringBuilder sb=new StringBuilder();
                String temp="";
                while(!stk.isEmpty() && stk.peek()!='['){
                    sb.append(stk.pop());
                }
                stk.pop();
                while(!stk.isEmpty() && Character.isDigit(stk.peek())){
                    temp=temp+stk.pop();
                }
                int k=Integer.parseInt(temp);
                while(k-->0){
                    for(int j=sb.length()-1;j>=0;j--){
                        stk.push(sb.charAt(j));
                    }
                    
                }
            }
            else
                stk.push(c);
        }
        StringBuilder modi=new StringBuilder();
        while(!stk.isEmpty())
            modi.append(stk.pop());
        return modi.reverse().toString();
    }
}
