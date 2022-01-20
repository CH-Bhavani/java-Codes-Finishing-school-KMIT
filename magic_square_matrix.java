/*



Ramu is given an array of numbers now he has to check for a super square matrix in the given array.

A super square matrix is a matrix such that every row sum, every column sum, and both
diagonal sums are all equal. 

The integers in the magic square do not have to be distinct. 
Every 1 x 1 grid is trivially a super square matrix 

Given an m x n integer grid , return the size (i.e., the side length k ) of the largest super square matrix that can be found
within this grid.



Example 1:

Input = 
4 5
7 1 4 5 6
2 5 1 6 4
1 5 4 3 2
1 2 7 3 4
Output: 3

Explanation: 

From the above array we have the following super square matrix of size 3 
5 1 6 
5 4 3
2 7 3 



The largest super square matrix has a size of 3.
Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
- Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
- Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
- Diagonal sums: 5+4+3 = 6+4+2 = 12


*/


import java.util.*;
public class square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                arr[i][j]=sc.nextInt();
        System.out.println(Print_square_matrix(arr,rows,cols));
    }
    public static int  Print_square_matrix(int[][] a,int r,int c){
        int[][] rowsum=new int[r][c];
        for(int i=0;i<r;i++){
            rowsum[i][0]=a[i][0];
            for(int j=1;j<c;j++){
                rowsum[i][j]=rowsum[i][j-1]+a[i][j];
            }
        }
        int[][] colsum=new int[r][c];
        for(int i=0;i<c;i++){
            colsum[0][i]=a[0][i];
            for(int j=1;j<r;j++){
                colsum[j][i]=colsum[j-1][i]+a[j][i];
            }
        }
        int result=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int l=Math.min(r-i,c-j);
                for(int k=l;k>result;k--){
                    if(is_equal_sum(i,j,k,a,rowsum,colsum)){
                        result=k;
                        break;
                    }
                }
            }
        }
        return result;
    }
    public static boolean is_equal_sum(int i,int j,int l,int[][] a ,int[][] rowsum,int[][] colsum){
        int target=rowsum[i][j+l-1]-rowsum[i][j]+a[i][j];
        for(int k=0;k<l;k++){
            if(rowsum[i+k][j+l-1]-rowsum[i+k][j]+a[i+k][j]!=target)
                return false;
        }
        for(int k=0;k<l;k++){
            if(colsum[i+l-1][j+k]-colsum[i][j+k]+a[i][j+k]!=target)
                return false;
        }
        int diagonal=0;
        for(int k=0;k<l;k++){
            diagonal+=a[i+k][j+k];
        }
        if(diagonal!=target)
            return false;
        for(int k=0;k<l;k++)
            diagonal-=a[i+l-1][j+k];
        return diagonal==0;
    }
}
