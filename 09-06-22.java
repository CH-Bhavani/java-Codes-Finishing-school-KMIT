/*
    2 Given number count the number of digits in the given number
    3 Note: with out using / operator or String functions
    4 example
    5 input =1
    6 output =1
    7 
    8 input =1000
    9 output =4
   10 
   11 input =10000
   12 output =5
   13 
   14 input =345289467
   15 output =9
   16 
   17 */
   18 
   19 import java.util.*;
   20 public class Test{
   21     public static void main(String[] args){
   22     Scanner sc=new Scanner(System.in);
   23     int n=sc.nextInt();
   24     System.out.println(Math.round(Math.log10(n)+1));
   25 }
   26 
   27 }
