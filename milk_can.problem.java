/*


Ramu is a milk supplier. He has only two aluminium cups of capacity m and n litres. 
Using these two cups only, he can measure the milk. 
He has to supply exactly P litres of milk

To measure the milk, the operations allowed are:
	- Fill one of the cups completely with milk.
	- Empty the other cup.
	- Pour milk from one cup into another cup till it fills completely,
	 or the first cup itself is empty.
	 
Such that, at the end one or both cups contains P litres of the milk.
	
Please help Ramu, to check whether P litres of milk can be measured
using the two cups or not.

Input Format:
-------------
3 space separated integers, m, n and P.

Output Format:
--------------
Print a boolean value.


input=3 5 4
output=true


input=2 4 5
output=false
*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(can_fill(m,n,p));
    }
    public static boolean can_fill(int m ,int n, int p){
        if(m+n<p) return false;
        else if (p%hcf(m,n)==0) return true;
        else return false;
    }
    public static int hcf(int m,int n){
        if(m==0) return n;
        return hcf(n%m,m);
    }
}
