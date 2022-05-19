/*

Mr Febin is working with numbers.
He wants to find all the AD Numbers,
An AD Number is defined as follows:
	- All the adjacent digits in the given number N 
	should have an absolute difference of 1 only. 

You will be given two integers, start and end,
Your task is to find all the AD Numbers in ascending order
in the range of [start, end], where both are inclusive.

Constarint:
----------
0 <= start < end <2*10^9.

Input Format:
-------------
Two space separated intergers,  start and end.

Output Format:
--------------
Print a list of integers.


Sample Input-1:
---------------
0 15

Sample Output-1:
----------------
0 1 2 3 4 5 6 7 8 9 10 12


Sample Input-2:
---------------
25 65

Sample Output-2:
----------------
32 34 43 45 54 56 65

*/

import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        AD(start,end);
    }
    public static void AD(int start,int end){
        for(int i=start;i<=end;i++){
                     int temp=i;
                    int r1=temp%10;
                    temp=temp/10;
                    boolean flag=true;
                    while(temp!=0){
                        int r2=temp%10;
                        temp=temp/10;
                        if(Math.abs(r1-r2)!=1){
                            flag=false;
                            break;
                        }
                        else
                            r1=r2;
                    }
                    if(flag)
                        System.out.print(i+" ");
            }
        }
    }
   
