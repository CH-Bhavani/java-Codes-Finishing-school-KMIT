/*


Seating Arrangement. 

There are two students in a class named '0' and '1'.
The height and width will be given by the teacher. 
There are many positions in the class to be occupied.
When the teacher asks the students to occupy the positions,
'1'  occupies all the postions and gives the turn to '0', to sit only in the middle(horizantally and vertically)

Help students to occupy the postions
There is a twist in this seating arrangement, if the height and width given by the teacher is a even integer , students dont occupy at all,in this case print -1 

Assume The height and width will be same  

input = 3
output =
101
000
101

input = 5
output =
11011
11011
00000
11011
11011

input = 7
output =
1110111
1110111
1110111
0000000
1110111
1110111
1110111


*/



import java.util.*;
public class test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arrange(n);
    }
    public static void arrange(int n){
        if (n%2==0)
            System.out.println("-1");
        else{
            int ones=n/2,count1=0,count2=0;
            StringBuilder sb=new StringBuilder();
            StringBuilder sb1=new StringBuilder();
            while(count1++<ones){
                sb.append(1);
                sb1.append(0);
            }
            sb.append(0);
            sb1.append(0);
            while(count2++<ones){
                sb.append(1);
                sb1.append(0);
            }
            for(int i=0;i<n;i++){
                if(i!=n/2)
                    System.out.println(sb.toString());
                else
                    System.out.println(sb1.toString());
            }
    }
}
}
