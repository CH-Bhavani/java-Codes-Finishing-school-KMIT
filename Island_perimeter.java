/*

You will be given a area of a matrix. Where the matrix has a
value 1/0. 1 represent the land and 0 represents the water.

The matrix is connected both row and column wise not diagonally. 
the matrix is surronded by water completely and there is exactly 1 island (i.e, 1 or more connected land cells)

The island doesn't have "lakes", meaning the water inside isn't connected to the
water around the island. One cell is a square with side length 1. The matrix is
rectangular,. we have to find  perimeter of the island.


input=4 4
0 1 0 0
1 1 1 0
0 1 0 0
1 1 0 0
output=16

Explanation- The perimeter is the 16 yellow stripes in the image above.



*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=sc.nextInt();
        System.out.println(Perimeter(arr,row,col));
    }
    public static int Perimeter(int[][] arr,int r,int c){
        int p=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=1) continue;
                else{
                    if(i-1<0 || arr[i-1][j]==0)p++;
                    if(i+1>=r || arr[i+1][j]==0) p++;
                    if(j-1<0 || arr[i][j-1]==0)p++;
                    if(j+1>=c || arr[i][j+1]==0)p++;
                }
            }
        }
        return p;
                
    }
}
