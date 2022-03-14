/*
Given a mXn matrix print the matrix in the following format.
sort the each matrix elements of diagonal in ascending order.

example:
input =
3
3
9 6 3
8 5 2
7 4 1
output =
1 2 3
4 5 6
7 8 9


input =
3
4
3 3 1 1
2 2 1 2
1 1 1 2
output =
1 1 1 1
1 2 2 2
1 2 3 3


*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt(); 
            }
        }
        Sort_Diagonals(arr,m,n);
    }
    public  static void Sort_Diagonals(int[][] arr,int m,int n){
        HashMap<Integer,PriorityQueue<Integer>> hm=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                hm.putIfAbsent(i-j,new PriorityQueue<Integer>());
                hm.get(i-j).add(arr[i][j]);
            }
        }
        int[][] fin=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                fin[i][j]=hm.get(i-j).poll();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(fin[i][j]+" ");
            }
            System.out.println();
        }
                
    }
}
