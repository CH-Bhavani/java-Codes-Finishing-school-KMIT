/*


Amazon Fire TV Stick Remote

Tinku a Small Kid is playing with the Amazon Fire TV Stick Remote
Tinku is not familar with the alphabets. 
He father gives him few alphabets and asks Tinku to type it. 
Tinku uses only one finger. 
At the Beginining, he will put his finger at the the 1st key, k[0];
To type the Next Alphabet he has to move his finger from that key(m) 
to that particular alphabet(n) he takes |m-n| seconds. 

Help Tinkus Father to see how much seconds does Tinku take to type the given alphabets.


input=poiuytrewqasdfghjklmnbvcxz
kmit
output=39


input=abcdefghijklmnopqrstuvwxyz
code
output=26

*/



import java.util.*;
class test{
    public static void str(String s,String k){
        int sum=0,l=0,j=0;
       for( int i=0;i<k.length();i++) {
           j=s.indexOf(k.charAt(i));
             int c=Math.abs(j-l);
            l=s.indexOf(k.charAt(i));
             sum+=c;
           }
    System.out.print(sum);}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String k=sc.next();
        str(s,k);
    }
}
