/*
Given a matrix of size R*C, print the matrix in the following given output.

input =
3 3
1 2 3
4 5 6
7 8 9
output =
1 2 3
6 9 8
7 4 5

input =3 4
1 2 3 4
5 6 7 8
9 10 11 12
output =
1  2  3  4
8 12 11 10
9  5  6  7




*/


import java.util.*;
class test{
	public static void print(int m,int n,int[][] a) {
		int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
 
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
 
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int mat[][] = new int[m][n];
	    for(int i=0;i<m;i++)
	        for(int j = 0;j<n;j++)
	            mat[i][j] = sc.nextInt();
		print(m,n,mat);
	}
}
