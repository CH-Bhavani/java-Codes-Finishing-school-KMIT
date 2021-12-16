/*Mr.Bob and Mr.Cob are working on a Military Mission. 
They are supposed to encode the message and send the message to the under-cover team.

Where Cob has written a script. 
Where the Script says double all the ascii values other than mentioned in the bracket
(97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

Help Bob in writing the Code. 

Sample Test Case-1
input = attack the enemy
output = at#tt#tac#ck#k t#th#he en#nem#my#y
*/
import java.util.*;
public class encode {
    public static  String encoded(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'
                    ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='A' ||str.charAt(i)=='E' ||
                    str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U' ||str.charAt(i)==' ')
                sb.append(str.charAt(i));
            else {
                sb.append(str.charAt(i));
                sb.append('#');
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(encoded(str));
    }
}
