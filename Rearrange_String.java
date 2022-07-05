/*
Somu is working on Machine Learning domain. He wants train the machine 
in such a way that, if he provided an image printed with a string on it,
the machine has to extract the text as a string and verify that, after shuffling 
the letters in the string, 'the shuffled string should be like no two adjacent 
letters should be same' 

You will be given extracted string, and
Can you help Somu to train the machine with the given constraint 
The machine has to print "true", if the constarint is met, 
Otherwise, print "false".


Input Format:
-------------
A String S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
aaabd

Sample Output-1:
----------------
true


Sample Input-2:
---------------
aaab

Sample Output-2:
----------------
false

*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        System.out.println(reArrange(s));
        
    }
    public static boolean reArrange(char[] str){
        Map<Character, Integer> freq = new HashMap<>();
        int max_freq = 0;
        for (int j = 0; j < (str.length); j++) {
            if (freq.containsKey(str[j])) {
                freq.put(str[j], freq.get(str[j]) + 1);
                if (freq.get(str[j]) > max_freq)
                max_freq = freq.get(str[j]);
                
            }
            else {
                freq.put(str[j], 1);
                if (freq.get(str[j]) > max_freq)
                max_freq = freq.get(str[j]);
                
            }
            
        }
        if (max_freq <= (str.length - max_freq + 1))
        return true;
        return false;
        
    }
}
