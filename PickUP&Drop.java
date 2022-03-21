/*
UBER driver has a vehicle, daily he used go in only one direction.
Capacity of the vehicle is S (no of seats except driver seat), 

Given a list of N bookings, booking[i]= [ num_customers, pickup, drop ].
booking indicates, number of customers to pick up, and pick up, droping points.

Initially the vehicle is empty.

Return true if and only if it is possible to pick up and drop off all customers of all bookings.

Input Format:
-------------
Line-1 -> Two integers N and S, number of bookings and number of seats in the vehicle.
Next N Lines -> three space separated integers, num_customers, pickup point, dropping point

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
2 5
2 1 5
3 3 7

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 4
2 1 5
3 3 7

Sample Output-2:
----------------
false


Sample Input-3:
---------------
3 11
3 2 7
3 7 9
8 3 9

Sample Output-3:
----------------
true


*/





import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int cap=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<b;i++){
            arr.add(new ArrayList<Integer>());
            int no=sc.nextInt();
            int s=sc.nextInt();
            int d=sc.nextInt();
            arr.get(i).add(no);
            arr.get(i).add(s);
            arr.get(i).add(d);
        }
        System.out.println(canRide(arr,cap));
    }
    public static boolean canRide(ArrayList<ArrayList<Integer>>arr,int cap){
        int[] count=new int[1001];
        for(ArrayList<Integer> a:arr){
            for(int i=a.get(1) ;i<a.get(2);i++){
                count[i]+=a.get(0);
            }
        }
        for(int c:count){
            if(c>cap) return false;
        }
        return true;

    }
}
