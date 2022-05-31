/*


Rakesh is calculating maximum value of two words len(word[i]) * len(word[j])  where the words do not share common letters.

Note: if no such two words exist , return 0.

ex:
input =abcw baz foo bar xtfn abcdef
output =16
abcw and xtfn two words doesnot share common letters so output is 16

input =a ab abc d cd bcd abcd
output =4
ab cd two words doesnot share common

input =a aa aaa aaaa
output =0
no such pair of words



*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        System.out.println(maxProduct(arr));
    }
    public  static int maxProduct(String[] words) {
        int n = words.length;
        List<Set<Character>> lst = new ArrayList(n);
        int max = 0;

        for(String word : words) {	
            Set<Character> set = new HashSet();
            lst.add(set);
            for(int i=0; i<word.length(); i++) {
                set.add( word.charAt(i) );
            }
        }

        for(int i=0; i<n; i++) {
            Set<Character> setI = lst.get(i);
            for(int j=i+1; j<n; j++) {
                boolean hasCommon = false;
                Set<Character> setJ = lst.get(j);
                for(Character c : setI) {
                    if( setJ.contains(c) ) {
                        hasCommon = true;
                        break;
                    }
                }

                if( !hasCommon ) 
                    max = Math.max(max, words[i].length()*words[j].length());	
            }
        }
        return max;
    }
}
