/*
There is a board with M*N size. 
The board contains M*N blocks of 1*1 size.
Each block is printed a number on it.

You will be given a number, your task is to find whether the number is printed on 
any of the blocks or not. If found print yes, otherwise print no.

NOTE: 
- The numbers printed on the board in each row are in increasing order. 
- Next row starting number is greater than the last number of the previous row.

Constarint:
-----------
Can you solve it in log(M)+ log(N) time. 


Input Format:
-------------
Line-1 -> Two integers M and N, board size.
Next M lines -> N space separated integers.
Last Line -> An integer T, number to search.

Output Format:
--------------
Print a boolean value, 'yes' if number found.
otherwise, 'no'.


Sample Input-1:
---------------
4 4
1 3 6 10
12 15 19 23
24 28 32 36
37 41 44 47
15

Sample Output-1:
----------------
yes


Sample Input-2:
---------------
4 4
1 3 6 10
12 15 19 23
24 28 32 36
37 41 44 47
26

Sample Output-2:
----------------
no

*/



import java.util.*;
public class blocks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        int[] arr1=new int[row*col];
        for (int i=0;i<row*col;i++){
                arr1[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        int ind=Arrays.binarySearch(arr1,search);
        if (ind>-1)
            System.out.println("yes");
        else
            System.out.println("no");
            
    }
}
