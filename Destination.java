/*
DPS school will run school buses from one location to 
differnt locations(ie routes) where 
routes[i]=[locationA, locationB]
Given n routes return the last stop location of the school bus. 

input =3
nagole uppal
uppal habsiguda
habsiguda nacharam

output =nacharam
Explanation: Starting at "nagole" busses will reach "nacharam" 
which is the last stop. bus route consist of "nagole" -> "uppal" -> "habsiguda" -> "nacharam".


input =3
tarnaka narayanaguda
uppal tarnaka
narayanaguda mahenderahills
output =mahenderahills

Explanation: All possible routes are:
uppal-> tarnaka -> narayanaguda->mahenderahills or
tarnaka -> narayanaguda -> mahenderahills
narayanaguda -> mahenderahills

*/

import java.util.*;
class  test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=m*2;
        String s[]=new String[n];
        List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        for(int i=0;i<n;i++){
            s[i]=sc.next();}
        for(int i=0;i<n;i+=2){
            l1.add(s[i]);}
        for(int i=1;i<n;i+=2){
            l2.add(s[i]);}
        for(String i:l2){
            if(!l1.contains(i)){
                System.out.println(i);
            break;
            }
        }
    }
}
