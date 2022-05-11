/*


Given a string expression of numbers and operators, return all possible results 
from computing all the different possible ways to group numbers and operators.
Note: assume operators will have only +,-,*
      All integer values must be in range between 0 to 99

Example 1:
input =2-1-1
output =0 2

expression = "2-1-1"
Output: [0,2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2

Note : print the output in ascending order 

Example 2:
input =2*3-4*5
output =-34 -14 -10 -10 10

expression = "2*3-4*5"
Output: [-34,-14,-10,-10,10]

Explanation:
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10



*/


import java.util.*;
public class test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<Integer> a=diffWaysToCompute(s);
        Collections.sort(a);
        for(Integer i:a)
            System.out.print(i+" ");
    }
    public static List<Integer> diffWaysToCompute(String string) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<string.length();i++){
            char x=string.charAt(i);
            if(x=='+' || x=='-' || x=='*'){
                String a=string.substring(0,i);
                String b=string.substring(i+1);
                
                List<Integer> aL=diffWaysToCompute(a);
                List<Integer> bL=diffWaysToCompute(b);
                for(Integer p1:aL){
                    for(Integer p2:bL){
                        int c=0;
                        switch(x){
                            case '+':c=p1+p2;
                            break;
                            case '-':c=p1-p2;
                            break;
                            case '*':c=p1*p2;
                            break;
                        }
                        ans.add(c);
                    }
                }
            }
        }
        if(ans.size()==0) ans.add(Integer.valueOf(string));
        return ans;
    }
}
