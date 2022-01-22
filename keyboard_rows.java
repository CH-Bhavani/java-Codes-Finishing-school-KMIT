/*




Three Friends are given three rows of the keyboard, The first row is given to Shyam,second row is given to gopal, third row is given to ramu. 

Teacher has given them few lines of words and asked each individual if they can print the words that can be printed using the letters of the rows given to them 

Shyam has given the row -   QWERTYUIOP/qwertyuiop
Gopal has given the row -    ASDFGHIJKL/asdfghjkl
Ramu has given the row -   ZXCVBNM/zxcvbnm

Teacher also gave the following rules in addition ;
    You may use one character in the row more than once.
    You may assume the input string will only contain letters of alphabet(A-Z/a-z).
    Assume the alphabets are case sensitive 

    Print -1 for all Boundary Conditions 

Example:

input =hello Alaska Dad Peace
output = 
Alaska 
Dad


Here the words Alaska and Dad are the characters of second student gopal only 


input =asdf qwer zxcv
output =
asdf
qwer
zxcv

input =Dad hAS the Key
output = Dad
hAS

input =to be or not TO be 
output = to
or
TO

*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        check(str);
    }
    public static int samerow(char x){
        Character[] r1 = { 'Q', 'W', 'E', 'R', 'T','Y', 'U', 'I', 'O', 'P','q', 'w', 'e','r', 't', 'y', 'u', 'i','o', 'p' };
        Set<Character> row1 = new HashSet<>(Arrays.asList(r1));
        Character[] r2 = { 'A', 'S', 'D', 'F', 'G','H', 'J', 'K', 'L','a', 's', 'd', 'f','g', 'h', 'j', 'k', 'l' };
        Set<Character> row2 = new HashSet<>(Arrays.asList(r2));
        Character[] r3 = { 'Z', 'X', 'C', 'V', 'B','N', 'M','z', 'x', 'c', 'v','b', 'n', 'm' };
        Set<Character>row3 = new HashSet<>(Arrays.asList(r3));
        if (row1.contains(x))return 1;
        if(row2.contains(x))return 2;
        if(row3.contains(x)) return 3;
        return 0;
    }
    public static void check(String[] str){
        ArrayList<String> arr=new ArrayList<>();
        for(String s:str){
            int flag=1;
            char temp=s.charAt(0);
            int row=samerow(temp);
            for(int i=1;i<s.length();i++){
                temp=s.charAt(i);
                if(row!=samerow(temp)){
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                arr.add(s);
        }
        if (arr.size()==0)
            System.out.println("-1");
        else{
            for(String a:arr)
                System.out.println(a);
        }
    }
    
}



//solution-2


class Solution {
    public String[] findWords(String[] words) {
        String a = "QWERTYUIOPqwertyuiop";
        String b = "ASDFGHJKLasdfghjkl";
        String c = "ZXCVBNMzxcvbnm";
        HashSet<Character> firstRow = new HashSet<>();
        HashSet<Character> secondRow = new HashSet<>();
        HashSet<Character> thirdRow = new HashSet<>();
        
        for(int i = 0;i<a.length(); i++)
            firstRow.add(a.charAt(i));
        
        for(int i = 0;i<b.length(); i++)
            secondRow.add(b.charAt(i));
        
        for(int i = 0;i<c.length(); i++)
            thirdRow.add(c.charAt(i));
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(String word : words){
            int first = 0;
            int sec = 0;
            int third = 0;
            
            for(int i=0;i < word.length(); i++){
                if(firstRow.contains(word.charAt(i))){
                    first++;
                }
                else if(secondRow.contains(word.charAt(i))){
                    sec++;
                }
                else if(thirdRow.contains(word.charAt(i))){
                    third++;
                }
            }
            
            if(first == word.length() ||sec == word.length() ||third == word.length()){
                list.add(word);
            }   
        }
        
        return list.toArray(new String[list.size()]);
    }
}
