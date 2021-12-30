/*There are B bags containing N gold boxes each. In each bag, gold boxes are 
arranged  in ascending order of their weights strictly, create a method in 
such a way that we need to return the least weight of gold box which is 
common least weight in all the given bags.

If we don’t have any common least weighted gold box, among all the bags then return -1.

Input Format:
-------------
Line-1: Two integers B and N, number of bags and number of goldboxes in each Bag.
Next B lines: N space separated integers, weights of GoldBoxes.

Output Format:
--------------
Print the least weight of gold box, if found
Print -1, if not found.


Sample Input:
---------------
5 5
1 2 3 4 5
2 3 6 7 9
1 2 3 5 8
1 3 4 6 8 
2 3 5 7 8

Sample Output:
----------------
3
*/


import java.util.*;
public class goldbag{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int gc=sc.nextInt();
        int[][] mat=new int[b][gc];
        for(int i=0;i<b;i++){
            for(int j=0;j<gc;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(common_min(mat,b,gc));
    }
    public static int common_min(int[][] mat,int b,int gc){
        ArrayList<Integer> arr=new ArrayList<>();
        int temp,flag=0;
        for(int j=0;j<gc;j++){
            temp=mat[0][j];
            int i=1,k=0;
            while(k<gc && i<b){
                if (mat[i][k]==temp){
                    flag=1;
                    i++;
                    k=0;
                }
                else{
                flag=0;
                k++;}
            }
            if (flag==1){
                return temp;
            }
        }
        return -1;
    }
}
