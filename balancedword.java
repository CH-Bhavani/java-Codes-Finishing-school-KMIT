/*Scott is a sweet lover and eats sweets daily. His father is worried about his health 
and gives a task to Scott. If Scott solves the task then he is allowed to eat the sweets.

His task is as follows

Scott is given a word 'W'. Now he is supposed to see, the word is a Balanced Word or Not .

A word is said to be Balanced word if it contains all characters same number of times. 
He can also make the word Balanced by removing  only one occurence of a character at any index in the word. 

If he is able to do so print "true" else print "false"


Sample Test Case-1

input = xyz
output = true

This is Balanced because (x-1,y-1,z-1)

Sample Test Case-2

input = xyzz
output = true

This is Balanced because (x-1,y-1,z-2)
He can remove one occurence of z, It results in (x-1,y-1,z-1)

Sample Test Case-3

input = xxyyzzzz
output = false

This is not Balanced because (x-2,y-2,z-4)
By removing once occurence of z, It results in (x-2,y-2,z-3)
So this is not Balanced

Sample Test Case-4

input = xzxyzxz
output = true

This is Balanced because (x-3,y-1,z-3)
By removing once occurence of y, It results in (x-3,z-3)
So this is  Balanced*/




import java.util.*;
public class sweets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        System.out.println(balanced(word));
    }
    public static boolean balanced(String w){
        HashMap<Character,Integer> hash=new HashMap<>();
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(hash.containsKey(c))
                hash.put(c,hash.get(c)+1);
            else
                hash.put(c,1);
        }
        int[] arr=new int[hash.size()];
        int i=0;
        for(Map.Entry<Character,Integer> e: hash.entrySet()){
            arr[i]=e.getValue();
            i++;
        }
        Arrays.sort(arr);
        if(arr[0]==arr[arr.length-1])
            return true;
        else if(arr[0]==1 && arr[1]==arr[arr.length-1])
            return true;
        else if (arr[arr.length-1]-1==arr[0])
            return true;
        return false;
       

    }
}
