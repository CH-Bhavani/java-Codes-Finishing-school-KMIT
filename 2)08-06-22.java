/*
    2 Given two numbers n1 and n2, convert all numbers in binary format and 
    3 return the count of numbers in the inclusive range n1, n2 having a prime number of set bits . 
    4 
    5 
    6 Note : Don't use bitCount() function
    7 
    8 
    9 input =6 10
   10 output =4
   11 for 6 in binary format 110 (2 set bits , and 2 is prime)
   12 for 7 in binary format 111 (3 set bits , and 3 is prime)
   13 for 8 is in binary format 1000 (1 set bit , and 1 is not prime)
   14 for 9 is in binary format 1001 (2 set bits , and 2 is prime)
   15 for 10 is in binary format 1010 (2 set bits , and 2 is prime)
   16 so output is 4
   17 
   18 input =10 15
   19 output =5
   20 for 10 in binary format 1010 (2 set bits , and 2 is prime)
   21 for 11 in binary format 1011 (3 set bits , and 3 is prime)
   22 for 12 in binary format 1100 (2 set bits , and 2 is prime)
   23 for 13 in binary format 1101 (3 set bits , and 3 is prime)
   24 for 14 in binary format 1110 (3 set bits , and 3 is prime)
   25 for 15 in binary format 1111 (4 set bits , and 4 is not prime)
   26 so output is 5.
   27 
   28 
   29 */
   30 import java.util.*;
   31 public class Test{
   32     public static void main(String [] args){
   33         Scanner sc=new Scanner(System.in);
   34         int n=sc.nextInt();
   35         int m=sc.nextInt();
   36         System.out.println(isPrime(n,m));
   37 
   38 
   39     }
   40     public static int isPrime(int n,int m){
   41         int count=0;
   42         for(int i=n;i<=m;i++){
   43             if(Prime(Integer.bitCount(i)))
   44                 count++;
   45         }
   46         return count;
   47     }
   48     public static boolean Prime(int n){
   49         if(n<=1)
   50             return false;
   51         for(int i=2;i<n;i++)
   52             if(n%i==0)
   53                 return false;
   54         return true;
   55     }
   56 }
   57 
