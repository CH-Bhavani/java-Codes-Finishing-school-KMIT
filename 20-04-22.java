/*
Prabhu is playing a game. 
As Part of this game at any given time he can score 3 or 5 or 10 points.
If the Target Score is Given to Prabhu. 
Find the total number of Possibility he can get the Score.

input = 13
output = 2

Explanation - 
3 5 5
3 10

Two Ways to reach the Target.

input = 20
output = 4

Explanation-
10 10
5 5 10
5 5 5 5 
3 3 3 3 3 5

*/



import java.util.*;
class test{
    public static void str(int n){
      int a[]=new int[n+1];
      Arrays.fill(a,0);
      a[0]=1;
      for(int i=3;i<=n;i++)
          a[i]+=a[i-3];
    for(int i=5;i<=n;i++)
          a[i]+=a[i-5];
          for(int i=10;i<=n;i++)
          a[i]+=a[i-10];
         System.out.print(a[n]);
           }
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       str(n);
    }
}
