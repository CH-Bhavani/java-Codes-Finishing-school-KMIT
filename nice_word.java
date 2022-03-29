/*


Given a array of "array of words" and "characters", 
find the sum of length of all nice words using those characters.

nice word: a word is nice, if it can be formed by characters.

example: 

input =cat bt hat tree
atach
output=6

The words that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

input =apple orange bat tree
atbeppol
output =8


*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        char[] chars=sc.next().toCharArray();
        ArrayList<Character> c=new ArrayList<>();
        for(char ch:chars) c.add(ch);
        System.out.println(fun(arr,c));
        
    }
    public static int fun(String[] arr,ArrayList<Character> chars){
        int sum=0,count=0,flag=1;
        for(String a:arr){
            count=0;
            flag=1;
            for(int i=0;i<a.length();i++){
                if(!chars.contains(a.charAt(i))){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                sum+=a.length();
            }
        }
        return sum;
    }
}
