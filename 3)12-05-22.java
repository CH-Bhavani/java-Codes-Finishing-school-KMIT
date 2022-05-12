/*
You are given a string s.

A split is called good if you can split s into two non-empty strings sleft and sright 
where their concatenation is equal to s (i.e., sleft + sright = s) and the number 
of distinct letters in sleft and sright is the same.

Return the number of good splits you can make in s.

 
input =aacaba
output: 2

Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.


Example 2:
input = abcd
Output: 1

Explanation: Split the string as follows ("ab", "cd").




*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
    System.out.println(goodSplit(s));
}
public static int goodSplit(String s){
    int count=0;
    for(int i=0;i<s.length();i++){
        String ls=s.substring(0,i+1);
        String rs=s.substring(i+1,s.length());
        if(count(ls)==count(rs))
            count++;
    }
    return count;
}
public static int count(String s){
    HashMap<Character,Integer> hm=new HashMap<>();
    for(char c:s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
    }
    return hm.size();
}
}





//sol-2



public int numSplits(String s) {
        HashSet<Character> hs=new HashSet();
        int[] l=new int[s.length()];
        int[] r=new int[s.length()];
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
            l[i]=hs.size();
        }
        hs.clear();
        for(int i=s.length()-1;i>=0;i--){
            hs.add(s.charAt(i));
            r[i]=hs.size();
        }
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(l[i]==r[i+1])
                count++;
        }
        return count;
    }
