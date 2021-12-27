/* Write a java program to remove all the digits and special characters from the
   input string and display the output in the specified format

sample
input = &*re(9m)o^v6e
output = remove

input=1str90&6i*4ng                                                                                                           
output=string
*/
import java.util.*;
public class Test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.replaceAll("[^a-zA-Z]",""));
        
    }
}
