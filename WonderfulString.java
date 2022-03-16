/*  

Wonderful String

You will be given a Wonderful String,print the numbers of '2' in the wonderful string. 

A wonderful string contains only two digits '1' and '2'.

The string has following rules
	- The first few digits are as follows: 
	    "1221121221221121122......"
	- The string is originally formed as follows:
		1 22 11 2 1 22 1 22 11 2 11 22 ......
	and the count of '1's or '2's in each consecutive groups are:
		1 2 2 1 1 2 1 2 2 1 2 2 ......
	the count sequence above is in the string S itself.



input=7
output=3

Explanation:
------------
The sustring of length 7 is "1221121".The count of 2's is 3.


input=12
output=7

Explanation:
------------
The sustring of length 12 is "122112122122".The count of 2's is 7.



*/


import java.util.*;
public class test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count2(n));
    }
    public static int count2(int n){
        String ini="12";
        if(n==2) return 1;
        if(n==1 || n==0) return 0;
        while(ini.length()<=n){
            StringBuilder sb=new StringBuilder();
            char last='0';
            for(int i=0;i<ini.length();i++){
                if(ini.charAt(i)=='1' && last=='0') {
                    sb.append("1");
                    last='1';
                    continue;
                }
                 if(ini.charAt(i)=='1' && last=='1') {
                    sb.append("2");
                    last='2';
                    continue;
                }
                 if(ini.charAt(i)=='1' && last=='2') {
                   sb.append("1");
                    last='1';
                    continue;
                }
                if(ini.charAt(i)=='2' && last=='1') {
                    sb.append("22");
                    last='2';
                    continue;
                }
               
                if(ini.charAt(i)=='2' && last=='2') {
                    sb.append("11");
                    last='1';
                    continue;
                }
            }
            ini=sb.toString();
        }
        int count=0;
        String sub=ini.substring(0,n);
        for(int i=0;i<n;i++){
            if(sub.charAt(i)=='2') count++;
        }
        return count;
    }
}
