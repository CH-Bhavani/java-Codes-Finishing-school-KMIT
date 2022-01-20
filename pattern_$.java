/*
Vikram a third class boy plays with a numbers, he will be given a number(n) and 
he starts writing the numbers on each line until he reaches the number(n).

Write the code and verify if the vikrams writing of the number is same or not. 

Assume n>=1


input = 5
output =
1
1 2
3 5 8
13 21 34 55
89 144 233 377 610


input = 4
output = 
1
1 2
3 5 8
13 21 34 55


 */



import java.util.*;
public class muki{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_numbers(n);
    }
    public static void print_numbers(int n){
        long ini=1;
        long prev=0,sum=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ini+" ");
                sum=ini+prev;
                prev=ini;
                ini=sum;
            }
            System.out.println();
        }
        
    }
}
