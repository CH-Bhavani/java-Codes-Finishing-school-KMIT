/*


Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.


*/

class Solution {
    public String removeKdigits(String s, int rem) {
      Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            while(!stk.isEmpty() && rem>0 && stk.peek()>s.charAt(i)){
                rem--;
                stk.pop();
            }
            stk.push(s.charAt(i));
        }
        while(rem>0 && !stk.isEmpty()){
            rem--;
            stk.pop();
        }
        // System.out.println(stk);
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty())
            sb.append(stk.pop());
        sb.reverse();
        // System.out.println(sb.toString());
        int zero=0;
        while(zero<sb.length()&& sb.charAt(zero)=='0'){
            zero++;
        }
        if(zero==sb.length()) return "0";
        return sb.substring(zero).toString();  
    }
}
