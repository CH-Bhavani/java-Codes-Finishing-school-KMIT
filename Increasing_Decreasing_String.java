/*
shiva is playing with group of characters, his teacher  called him and asked him to arrange the character as per the following rules.


rule1: remove the smallest character from the group and append it to the result.

rule2: remove the smallest character from the group which is greater than the last appended character to the result and append it.

rule3: Repeat rule 2 until you cannot pick more characters.

rule4: remove the largest character from the group and append it to the result.

rule5: remove the largest character from group which is smaller than the last appended character to the result and append it.

rule6: Repeat rule: 5 until you cannot pick more characters.

rule7: Repeat the rules from 1 to 6 until you pick all characters from the group.

In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after doing the above rules.

 
Input: s = "aaaabbbbcccc"
Output: "abccbaabccba"

Explanation: After rules 1, 2 and 3 of the first iteration, result = "abc"
After rules 4, 5 and 6 of the first iteration, result = "abccba"
First iteration is done. Now s = "aabbcc" and we go back to rule 1
After rules 1, 2 and 3 of the second iteration, result = "abccbaabc"
After rules 4, 5 and 6 of the second iteration, result = "abccbaabccba"


input=matratcat
output=acmrttaat


*/






import java.util.*;
public class test{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(new_string(s));
    }
    public static String new_string(String s){
       if(s.length()<=1) return s;
        Map<Character,Integer> map = new TreeMap<Character,Integer>();
        int L = s.length();
        for(int i=0;i<L;i++){
            char c =s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String result ="";        
        while(result.length()<L){
            for(Map.Entry<Character,Integer> e : map.entrySet()){
                if(e.getValue()>=1){
                    result += ""+Character.toString(e.getKey());
                    map.put(e.getKey(),e.getValue()-1);
                }
               
            }            
            ArrayList<Character> list = new ArrayList<>(map.keySet());
            list.sort(Collections.reverseOrder());
            for (Character key : list) {
                if(map.get(key)>=1){
                    result += Character.toString(key);
                    map.put(key,map.get(key)-1);
                }                
               
            }
        }
        return result;
    }
}



