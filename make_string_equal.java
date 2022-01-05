/*

True Or False 

Shyam is given series of  Statements
T represents True, F represents False. 

Initially all the statements will be False.
He can change from T to F or F to T . 
If he starts at one Statement, the process has to continue upto end of the statement.
He can start at any part of the Statement. 
If it is 'F' it changes to 'T' and if it is 'T' it changes to 'F'. 
He has to do minimum number of swaps on the Initial Statement to reach the given target state


Input = TFTTT
output = 3

Explanation - Initially FFFFF
Change from the Third Statement FFTTT
Change from the First Statement TTFFF
Change from the Second Statement  TFTTT



*/




import java.util.*;
public class test{
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String ini="";
        for(int i=0;i<str.length();i++)
            ini+='F';
        System.out.println(make_equal( str,ini));
    }
    public static int make_equal(String str,String s){
        if (str.equals(s))
            return 0;
        Character prev=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=prev)
                count++;
            prev=str.charAt(i);
        }
        return count;
    }
}
