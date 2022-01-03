/*A Gold  merchant, announced an offer that they will charge the minimum price to make all the 
gold coins into one.

Customers who has different weights of gold coins wants to utilize the offer.

The processing charge to make two coins into one is calculated as follows:
	- To make two coins of weights A and B into one coin, 
	  you have to pay the amount 'A + B'. 

Your task is to help Gold Merchant to keep his promise and 
to charge the minimum amount to  gold coins
into one gold coin

Input Format:
-------------
Single line of space separated integers, number on the boxes.

Output Format:
--------------
Print an integer, minimum amount to be paid by Customer


Sample Input-1:
---------------
4 3 6

Sample Output-1:
----------------
20


Sample Input-2:
---------------
5 2 4 3 6

Sample Output-2:
----------------
45


*/


import java.util.*;
public class gold{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<s.length;i++)
            arr[i]=Integer.valueOf(s[i]);
        Arrays.sort(arr);
        System.out.println(minamount(arr));
    }
    public static int minamount(int[] arr){
        int maxsum=0;
        for(int i=0;i<arr.length-1;i++){
                int sum=arr[i]+arr[i+1];
                arr[i]=0;
                arr[i+1]=sum;
                maxsum=maxsum+sum;
                Arrays.sort(arr);
            }
            return maxsum;
        }
    }




