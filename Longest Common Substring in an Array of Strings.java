/*

The municipal corporation of hyd is planning to conduct a voting survey, 
they are getting confused with the common names in the given list. 
The concerned officer finds the few characters of the names same and removes them. 
Help the officer to find the same characters that begin with the same name

The first line of input contains the number of voters names followed by voters names

If no such thing exists print -1

input = 3
apple ape april
output = ap


input = 4
abhishake abhignya abhinayni abhiram
output=abhi

*/


// method -1

import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(commonchar(arr,n));
    }
    public static String commonchar(String[] arr,int n){
        if (n==1)
            return "-1";
        String same=arr[0],same1="";
        for(int i=1;i<n;i++){
            same1="";
            for(int j=0;j<arr[i].length();j++){
                if(j!=same.length() && same.charAt(j)==arr[i].charAt(j))
                    same1+=arr[i].charAt(j);
                else
                    break;
            }
            same=same1;
        }
        return same.length()==0?"-1":same;
    }
}




//method -2



import java.io.*;
import java.util.*;
 
class stem {
 
    // function to find the stem (longest common
    // substring) from the string  array
    public static String findstem(String arr[])
    {
        // Determine size of the array
        int n = arr.length;
 
        // Take first word from array as reference
        String s = arr[0];
        int len = s.length();
 
        String res = "";
 
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
 
                // generating all possible substrings
                // of our reference string arr[0] i.e s
                String stem = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++)
 
                    // Check if the generated stem is
                    // common to all words
                    if (!arr[k].contains(stem))
                        break;
 
                // If current substring is present in
                // all strings and its length is greater
                // than current result
                if (k == n && res.length() < stem.length())
                    res = stem;
            }
        }
 
        return res;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        String arr[] = { "grace", "graceful",
                        "disgraceful","gracefully" };
       
        // Function call
        String stems = findstem(arr);
        System.out.println(stems);
    }
}
