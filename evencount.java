/*
Soumika has a string S and its starting index is 1. 
The string S consists of characters from 1-9. As she is very intelligent, she wants to test his brother Vinay Tendulkar. 
She asked her brother Vinay Tendulkar to count the number of even numbered characters ( i.e 2,4,6,8 ) for every index i

For an index i, the result should be calculated from i to the end of the string. 

As Vinay doesn't know about programming, he wants you to help him find the solution.

Input:
First line contains a string S.

Output:
Print |S| space-separated integers,the result of every index.

Sample Input :
574674546476

Sample Output :
7 7 7 6 5 5 4 4 3 2 1 1

Explanation :

Given string S is .
for index 1
Number of even numbers from 5 to end of the string is 7 so the result of index 1 is 7.
for index 2
Number of even numbers from 7 to end of the string is 7 so the result of index 2 is 7.
for index 3
Number of even numbers from 4 to end of the string is 7 so the result of index 3 is 7.
for index 3
Number of even numbers from 6 to end of the string is 6 so the result of index 4 is 6.....
.
.
.

ex:2
input=64646442
output=8 7 6 5 4 3 2 1
 */




import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int j;
        for(int i=0;i<num;i++){
            for(j=0;j<=i;j++){
                int x=0;
                for(int v=0;v<j;++v){
                    x=x+num-v;
                }
                if(j%2==0){
                    System.out.print(x+i-j+1+" ");
                }
               else
               System.out.print(x+num-i+" ");
            }
            System.out.println();
        }
}
}
