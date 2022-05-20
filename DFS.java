/*


Student Groups.

In a college, differents students groups conducted a survery, to find out 
which group has the biggest count of students in a student group. 

Students has a status of 1/0.
If there is 1 it means there are connected with each other.
If 0 they are not connected. 

Few Students those who are not intrested to join any group they break the 
chain by making the status 0 . This way there will be n number of student groups.

Students are connected either horizontally, vertically or diagonally 
with each other and they form a student-group. 
There may be zero or more student-groups.

The Student Union Groups want to know the biggest student group.

You will ge given M,N Groups whose status is either 0/1

Sample Input-1:
---------------
5 4
0 0 1 1
0 0 1 0
0 1 1 0
0 1 0 0
1 1 0 0

Sample Output-1:
----------------
8


Sample Input-2:
---------------
5 5
0 1 1 1 1
0 0 0 0 1
1 1 0 0 0
1 1 0 1 1
0 0 0 1 0

Sample Output-2:
----------------
5

In the above example we have 3 students groups
first group has 5 
second group has 4 
third group has 3 

Among those the first group has the maximum students so print 5  


*/
import java.util.*;
class test{
  static int count;
    public static boolean isSafe(int a[][], int r, int c,
                   boolean vis[][],int n,int k)
    {
        return ((r >= 0) && (r<n) &&(c>=0) && (c<k) &&
             (a[r][c]==1 && !vis[r][c]));
    }
    public static void DFS(int a[][],int r,int c,boolean vis[][],int n,int k)
    {
        int ro[] = new int[] {-1,-1,-1,0,0,1,1,1};
        int co[] = new int[] {-1,0,1,-1,1,-1,0,1};

        vis[r][c] = true;
        for (int m=0;m<8;m++){
            if (isSafe(a, r+ro[m],c+ co[m],vis,n,k) ){
                count++;
            
                DFS(a,r+ro[m],c+co[m],vis,n,k);}
    }}
 
    public static int count_students(int a[][],int n,int k)
    {
        boolean vis[][] = new boolean[n][k];
 
        int res = 0;
       for(int i=0;i<n;i++){
           for(int j=0;j<k;j++){
                if (a[i][j]==1 && !vis[i][j]){
                    count=1;
                    DFS(a,i,j,vis,n,k);
                  res=Math.max(count,res);
                }}}
 
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[][]=new int[n][k];
        for(int i=0;i<n;i++){
   for(int j=0;j<k;j++){
       a[i][j]=sc.nextInt();
   }}
     System.out.print(count_students(a,n,k));
}}


