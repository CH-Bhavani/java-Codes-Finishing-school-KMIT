/*

Pythagoras a mathematicians is playing with a group of numbers which contains distinct numbers(>0),
He finds the number of valid quadruples that can be formed with the given numbers.

The rules to check if it is a valid qudraples are as follows:
    - It contains 4 numbers a, b, c, d
    where a*b = c*d  and a != b != c != d

If He is not able to do so, he prints 0 


Write the code to check if the Pythagoras is correct or not. 

The first line of input consists of the group size followed by group numbers 

Input =5
3 2 4 1 6
output= 16

Explanation:
-------------
There are 16 valid Quadrules:
(2,3,1,6) , (2,3,6,1) , (6,1,3,2) , (6,1,2,3)
(3,2,1,6) , (3,2,6,1) , (1,6,3,2) , (1,6,2,3)
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)


Sample Input-2:
---------------
4
2 3 5 7

Sample Output-2:
----------------
0
*/





import java.io.*;
import java.util.*;
public class test
{

static void sameProductQuadruples(int[] nums,int N)
{

int[] umap = new int[10000];

int res = 0;

for (int i = 0; i < N; ++i)
{
for (int j = i + 1; j < N; ++j)
{
int prod = nums[i] * nums[j];
res += 8 * umap[prod];
++umap[prod];
}
}

System.out.println(res);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
sameProductQuadruples(arr, n);
}
}
