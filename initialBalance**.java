/*

/*
You are given a list of N transfers (numbered from 0 to N.1) between two banks,
bank A and bank B. The K-th transfer is described by two values 
    - R[K] (either "A" or "B") representing the recipient 
      (the bank the transfer is sent to); 
    - V[K] denoting the value sent via the transfer. 

All transfers are completed in the order they appear on the list. The banks 
do not want to go into debt (i.e. their account balance may not drop below 0). 

What minimum initial account balance in each bank is necessary in order to 
complete the transfers? 

Write a function: 
-----------------

	public int[] solution(String R, int[] V);


that, given a string R and an array of integers V, both of length N, returns 
an array of two integers. The integers should represent the minimum 
initial account balances for banks A and B in the following order: 
[bank A, bank B]. 

Result array should be returned as an array of integers. 

Input Format:
-------------
Line-1: A String R, consist of letters A nd B only of length N
Line-2: N space separated integers, array V[].

Output Format:
--------------
Print the initial bank balances of bank-A abd bank-B

Samlpe Input-1:
---------------
BAABA
2 4 1 1 2

Sample Output-1:
----------------
2 4

Explanation:
------------
Given R = "BAABA" and V = [2, 4, 1, 1, 2], the function should return[2, 4].
The bank accounts balances after each transfer are shown in the following table

                        |A B
============================
initial balance         |2 4 
transfer 2 from A to B  |0 6 
transfer 4 from B to A  |4 2 
transfer 1 from B to A  |5 1 
transfer 1 from A to B  |4 2 
transfer 2 from B to A  |6 0 

Samlpe Input-2:
---------------
ABAB
10 5 10 5

Sample Output-2:
----------------
0 15

Explanation:
------------
Given R = "ABAB" and V = [10, 5, 10, 15], the function should return [0, 15]
 


*/


import java.util.*;
public class test{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String R = sc.next();
        int V[] = new int[R.length()];
        for(int i=0;i<V.length;i++){
            V[i]=sc.nextInt();
        }
        int arrr[] = new test().solution(R,V);
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
        }  
    public int[] solution(String R, int[] V){
        int y=0,xmax=0,ymax=0,x = 0;
        int arr[] = new int[2];
        for(int i=0;i<V.length;i++){
            if(R.charAt(i)=='A'){
                x=x+V[i];
                y=y-V[i];
            }
            else if(R.charAt(i)=='B'){
                y=y+V[i];
                x=x-V[i];
            }
            if(y<0){
                int m = Math.abs(y);
                ymax = Math.max(ymax,m);
            }
            if(x<0){
                int n = Math.abs(x);
                xmax = Math.max(xmax,n);
            }
        }
        arr[0] = xmax;
        arr[1] = ymax;
        return arr;
    }

}
