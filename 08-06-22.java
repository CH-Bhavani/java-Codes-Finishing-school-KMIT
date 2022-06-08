/*
given an array and two integers n1 and n2, 
find the sum of all the numbers between n1th and n2th smallest elements of that array
Note: don't use sort method 

ex:
input =6
1 3 12 5 15 11
3 
6
output =23
after sorting 1 3 5 11 12 15
n1= 3 ie 3rd smallest number is 5 
n2=6 ie 6th smallest number is 15
The sum of numbers between 5 and 15 is 23 (11+12). 

input =4
3 5 8 7
1
4
output =12
n1=1 ie 1st smallest number is 3
n2=4 ie 4th smallest number is 8
The sum of the numbers between is 12(5+7).


*/
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
            pq.offer(sc.nextInt());
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(Sum(pq,n1,n2));
    }
    public  static int Sum(PriorityQueue<Integer> pq,int n1,int n2){
        int count=0,sum=0;
        while(!pq.isEmpty()){
            int i=pq.poll();
            count++;
            if(count >n1 && count<n2)
                sum+=i;
        }
        return sum;
        
    }
}




