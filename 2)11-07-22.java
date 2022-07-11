/*



Sonarita has given a small work on Manipulating characters of string
She have given a string(a-z), and an integer array A[]
Now she has  to modify 'S' in such way:
replace the 'i+1' characters in the string, with next i-th character 
in alphabetic order(cyclic).

For example, if S="art", Arr[]=[2,3,5] is 3, 
i=0, modify('a') = 'c' , S="crt".
i=1, modify('c') = 'f', modify('r') = 'u', S="fut".
i=2, modify('f') = 'k', modify('u') = 'z', modify('t') = 'y', S="kzy"
Finally modified string is kzy. 

Note: if arr[i]=3 modify('z') ='c'

Return the final modified string after all such modifications to S are applied.

Input Format:
-------------
Line-1 -> A String S,  string length is L
Line-2 -> L space separated integers.

Output Format:
--------------
Print modifed String.


Sample Input-1:
-------------------
adbp
1 2 3 4

Sample Output-1:
--------------------
kmit



*/





import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length(),sum=0;
        int[] arr=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
            sum=(sum+arr[i])%26;
        }
        String temp="";
        for(int j=0;j<l;j++){
            int index=s.charAt(j)-'a';
            System.out.print((char)((index+sum)%26+97));
            sum=Math.floorMod(sum-arr[j],26);
        }
        
        
    }
}
