/*You will be given a word 'w' and a group of words 'g'. 

check if 'w' can be broken into a space separated characters of one or more in the given group of words 'g'

Note the same word in the group of words may be re used multiple times in the breaking. 

The first line of input contains the group of words(g) followed by a word(w)

if it can done print true else print false

input=fleet gold
fleetgold
output=true

Explanation: prints true because fleetgold  can be broken as fleet gold

input=apple pen
applepenapple
output=true

Explanation: print true because "applepenapple" can be broken as "apple pen apple".
Note that you are allowed to reuse group of words

input=cats dogs and and cat
catsandog
output=false


*/




import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String word=sc.next();
        System.out.println(check(s,word));
    }
    public static boolean check(String[] s,String word){
        ArrayList<String> dict=new ArrayList<>();
        for(String str:s) dict.add(str);
        int size=word.length();
        if(size==0) return true;
        boolean []dp=new boolean[size+1];
        for(int i=1;i<=size;i++){
            if(dp[i]==false && dict.contains(word.substring(0,i))) dp[i]=true;
            if(dp[i]==true){
                if(i==size) return true;
                for(int j=i+1;j<=size;j++){
                    if(dp[j]==false && dict.contains(word.substring(i,j))) dp[j]=true;
                    if(j==size && dp[j]==true) return true;
                }
            }
        }
        return false;
    }
}
