/*
Ramesh is travelling countries either by air transport or sea transport (air represents 1 and sea  represents 0).
if he visited any country through sea(ie 0) then he will travel all of it's left side ,
right side ,upside and downside countries will visit by sea transport.

ex:
input =3 3
1 1 1
1 0 1
1 1 1
output =
1 0 1
0 0 0
1 0 1

Ramesh will travel all of its left right,
down and up by sea transport so change values of 1's to zero of same row and same column

  0
 000
  0
so final output would be 
1 0 1
0 0 0
1 0 1



ex: 2
input =3 4
0 1 2 0
3 4 5 2
1 3 1 5
output =
0 0 0 0
0 4 5 0
0 3 1 0



*/




import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        travel(arr,m,n);
    }
    public static int[][] travel(int[][] arr,int m,int n){
        int[][] fin=new int[m][n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                fin[i][j]=arr[i][j];
            }
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    l.add(i);
                    l.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(l.contains(i)|| l.contains(j))
                    fin[i][j]=0;
            }
        }
    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(fin[i][j]+" ");
            }
            System.out.println();
        }
    return fin;
}
}
