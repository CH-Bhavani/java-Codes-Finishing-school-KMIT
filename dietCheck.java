

/*A Chef prepares a Balanced Diet with 'S' and 'M' amounts of Ingredients. 
    2 
    3 Balanced Diet are those which have equal quantity of 'S' and 'M' ingredients .
    4 
    5 Given a Balanced Diet  split it in the maximum amount of balanced sub diets
    6 
    7 Return the maximum amount of splitted balanced diets
    8 
    9 Sample Test Case - 1
   10 
   11 input = SMSSMMSMSM
   12 output = 4
   13 
   14 
   15 Explanation: Diet can be split into "SM", "SSMM", "SM", "SM", each Sub Diet contains same
   16 number of 'M' and 'S'.
   17 
   18 
   19 
   20 Sample Test Case - 2
   21 
   22 Input  = SMMMMSSSMS
   23 output = 3
   24 
   25 Explanation: Diet can be split into "SM", "MMMSSS", "MS", each Sub Diet contains same
   26 number of 'M' and 'S'.
   27 
   28 
   29 Sample Test Case - 3
   30 
   31 Input  = "MMMMSSSS"
   32 output = 1
   33 
   34 Explanation: Diet can be split into only one Diet "MMMMSSSS".*/
   35 
test.java
    1 import java.util.*;
    2 public class test{
    3     public static void main(String[] args){
    4         Scanner sc=new Scanner(System.in);
    5         String diet=sc.next();
    6         System.out.println(BalancedDiet(diet));
    7     }
    8     public static int BalancedDiet(String diet){
    9         Stack<Character> stk=new Stack<Character>();
   10         int count=0;
   11         stk.push(diet.charAt(0));
   12         for(int i=1;i<diet.length();i++){
   13             if(stk.isEmpty()||stk.peek()==diet.charAt(i))
   14                 stk.push(diet.charAt(i));
   15             else if(stk.peek()!=diet.charAt(i)){
   16                 stk.pop();
   17                 if(stk.isEmpty())
   18                     count++;
   19             }
   20         }
   21         return count;
   22     }
   23 }
