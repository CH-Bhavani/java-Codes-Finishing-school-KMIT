/*

Write a program to print the following pattern 

input = 3
output =
AAAAAA
BAAAAB
BBAABB
BBAABB
BAAAAB
AAAAAA


input = 6
output = 
AAAAAAAAAAAA
BAAAAAAAAAAB
BBAAAAAAAABB
BBBAAAAAABBB
BBBBAAAABBBB
BBBBBAABBBBB
BBBBBAABBBBB
BBBBAAAABBBB
BBBAAAAAABBB
BBAAAAAAAABB
BAAAAAAAAAAB
AAAAAAAAAAAA

*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<String> l=new LinkedList<>();
        int n=sc.nextInt();
        int row=0;
        while(row<n){
            String temp="",temp1="";
            for(int j=0;j<row;j++){
                temp+="B";
            }
            for(int k=0;k<2*n-2*row;k++){
                temp1+="A";
            }
            row++;
            l.add(temp+temp1+temp);
        }
        for(String t:l){
            System.out.println(t);
        }
        Collections.reverse(l);
        for(String t:l){
            System.out.println(t);
        }
        
    }
}
