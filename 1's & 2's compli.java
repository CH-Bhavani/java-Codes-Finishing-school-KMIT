/*
Harsha a second class student is playing a game on his tab. 

where he has go to second level. He can reach second level if and only if he solves the first level. 

In the first level he will be a given a number series which will contain only '1' and '0's. 

He has to replace '0' to '1' and '1' to '0' and add '1' at the end and produce a new result. 

If he is able to produce a new result he can reach the second level. Help him to reach the second level. 


Examples:

 "0111" is "1000" and adding 1 at the end we get 1001
 "1100" is  "0011" and adding 1 at the end we get 0100

Here adding will done from the last 
when we add two '1's  we get 10 as the result and 1 is carry forwarded, on continuing the same process we get 0100 as the result 


Sample Test Case - 1
input = 0111
output = 1001

Sample Test Case - 2
input = 1100
output = 0100
*/

import java.util.*;
public class compliment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String series=sc.next();
        System.out.println(twocompliment(series));
    }
    public static String onecompliment(String bin){
        String ones="";
        for(int i=0;i<bin.length();i++){
            if (bin.charAt(i)=='1')
                ones=ones+"0";
            else
                ones=ones+"1";
        }
        return ones;
    }
    public static String twocompliment(String bin){
        String twos=onecompliment(bin);
        int carry=0,i=0;
        for(i=twos.length()-1;i>=0;i--){
            if (twos.charAt(i)=='1')
                twos=twos.substring(0,i)+"0"+twos.substring(i+1);
            else{
                twos=twos.substring(0,i)+"1"+twos.substring(i+1);
                break;
                }
        }
        if (i==-1){
            twos='1'+twos;
        }
        return twos;
    }
}


