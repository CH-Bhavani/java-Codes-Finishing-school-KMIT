/*

Shyam is playing with group of characters, where the group of characters contain only A/B.

He has to return the count of non-empty substrings from this group which will have the same number of
A's and B's and all the A's and all the B's in these substrings are grouped consecutively

Substrings that occur multiple times are counted the number of times they occur.

 
Example 1:

Input = AABBAABB
Output = 6

Explanation: 
There are 6 substrings that have equal number of consecutive B's and A's: 
"AABB", "AB", "BBAA", "BA", "AABB", and "AB".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "AABBAABB" is not a valid substring because all the A's (and B's) are not grouped together.

Example 2:

Input = BABAB
Output = 4
Explanation: 
There are 4 substrings: "BA", "AB", "BA", "AB" that have equal number of consecutive B's and A's.




*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        System.out.println(subString(s));
    }
    public static int subString(char[] s){
        ArrayList<Integer> count=new ArrayList<>();
        int cou=1;
        for(int i=1;i<s.length;i++){
            if(s[i-1]==s[i]) cou++;
            else{
                count.add(cou);
                cou=1;
            }
        }
        count.add(cou);
        int fin=0;
        for(int j=1;j<count.size();j++){
            fin+=Math.min(count.get(j-1),count.get(j));
        }
        return fin;
    }
}
