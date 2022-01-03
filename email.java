/* Steve is Designing a New email system.Where he wants to eliminate the gamil  based on few conditions. 

Every valid email consists of a local name and a domain name, in between '@'; 
For example, in "alice@gmail.com" , "alice" is the local name, and "gmail.com" is the domain name.

Besides lowercase letters, the email may contain one or more '.' or '+' .

If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to
the same address without dots in the local name. 


For example, "alice.z@gmail.com" and "alicez@gmail.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. 
This allows certain emails to be eliminated.
This rule will not be applicable to  to domain names.


For example, "m.y+name@email.com" will be forwarded to "my@email.com" .
It is possible to use both of these rules at the same time.


Help Steve to solve the problem 
He will be given an group of email-ids where we send one email to each emails[i], return the number of different addresses that
actually receive mails.


Sample Test Case 
Input =test.email+alex@gmail.com  test.e.mail+bob.cathy@gmail.com  testemail+david@gm.ail.com
Output: 2

Explanation: "testemail@gmail.com" and "testemail@gm.ail.com" actually receive mails.


Example 2:
Input: emails =a@gmail.com b@gmail.com c@gmail.com
Output: 3

*/



import java.util.*;
public class email{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        System.out.println(newmail(arr));
    }
    public static int newmail(String[] a){
        HashSet<String> set=new HashSet<>();
        for(String s:a){
            String[] mail=s.split("@");
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<mail[0].length();i++){
                if(mail[0].charAt(i)!='.' &&  mail[0].charAt(i)!='+' )
                    sb.append(mail[0].charAt(i));
                else if(mail[0].charAt(i)=='+' )
                    break;
            }
            set.add(sb.toString()+mail[1]);
        }
        return set.size();
    }
}
