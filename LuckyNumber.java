/*


Given an matrix with no duplicate values, return all lucky numbers in the

A lucky number is an element of the matrix such that, it is the maximum element in its row and minimum in its column.

ex:
input =
3 3
3 7 8
9 11 13
15 16 17
output =8
explanantion: 8 is the only lucky number since it is the maximum number in row and minimum in its column.


ex2:
input =
3
4
15 16 17 12
9 3 8 7
1 10 4 2
output =-1
none of the elements in the matrix matches the luckynumber rules. so print -1.

input =
2 2
1 2
7 8
oaximum number in row and minimum in its column.




*/




import java.util.*;
public class test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        luckyNumber(arr,r,c);
    }
    public static void luckyNumber(int[][] arr,int r,int c){
        HashMap<Integer,Integer> row=new HashMap<>();
        HashMap<Integer,Integer> col=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                row.put(i,Math.max(row.getOrDefault(i,Integer.MIN_VALUE),arr[i][j]));
                col.put(j,Math.min(col.getOrDefault(j,Integer.MAX_VALUE),arr[i][j]));
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row.get(i)==arr[i][j] && col.get(j)==arr[i][j])
                    l.add(arr[i][j]);
            }
        }
        if(l.size()==0)
            System.out.println("-1");
        else
            for(int i:l)
                System.out.print(i);
    }
}
