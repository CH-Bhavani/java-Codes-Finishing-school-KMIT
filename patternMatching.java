/*


Given a list of strings words and a string pattern, return a list of words[i] that match pattern. 
You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing 
every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps
to another letter, and 
no two letters map to the same letter.

Note: print output in ascending order of words

input =abc deq mee aqq dkd ccc
abb
ouput =aqq mee

words= abc deq mee aqq dkd ccc
pattern =abb
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
             "aqq" matches the pattern because there is a permutation {a -> a, b-> q}
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, 
since a and b map to the same letter.



Example 2:
input =a b c
a
ouput =a b c



*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] word=sc.nextLine().split(" ");
        String pattern =sc.next();
        patternMatch(word,pattern);
        
        
    }
    public static void patternMatch(String[] w,String p){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:p.toCharArray())
            hm.put(i,hm.getOrDefault(i,0)+1);
        List<String> l=new ArrayList<>();
        for(String f:w){
            if(f.length()!=p.length())
                continue;
            HashMap<Character,Integer> hmp=new HashMap<>();
            for(char i:f.toCharArray())
                hmp.put(i,hm.getOrDefault(i,0)+1);
            if(hmp.size()==hm.size())
                l.add(f);
        }
        Collections.sort(l);
        for(String k:l)
            System.out.print(k+" ");
    }
}
