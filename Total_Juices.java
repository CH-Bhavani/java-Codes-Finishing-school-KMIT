    /*1 Aarush , a Second Class Kid went to Summer Carnival and choose to buy soft juices.
    2 At the Juice point there are n soft juices, each with a price.
    3 Aarush has few money, He is interested in buying all the juices. 
    4 Help Aarush, how many juices can he buy with all the money he has.
    5 
    6 you will be given an array of prices, where prices[i] is the cost of 
    7 one juice. 
    8 
    9 He can buy the juice in any order.
   10 
   11 Example 1:
   12 Input = 1 3 2 4 1
   13 7
   14 output = 4
   15 
   16 Explanation: 
   17 The boy can buy juice at indices 0 1 2 4 
   18 for a total price of 1 + 3 + 2 + 1 = 7.
   19 
   20 Example 2:
   21 Input  = 10 6 8 7 7 8
   22 5
   23 Output = 0
   24 Explanation: The boy cannot afford any of the soft juice.
   25 
   26 Example 3:
   27 Input = 1 6 3 1 2 5
   28 20
   29 Output = 6
   30 Explanation: He can buy all the soft juices for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
   31 
   32 Constraints:
   33 prices.length == n
   34 1 <= n <= 10^5
   35 1 <= prices[i] <= 10^5
   36 1 <= price <= 10^8
   37 
   38 
   */
   
test.java
    1 import java.util.*;
    2 class test{
    3     public static void main(String[] args){
    4         Scanner sc=new Scanner(System.in);
    5        int n=sc.nextInt();
    6         int[] arr=new int[n];
    7         for(int i=0;i<n;i++)
    8             arr[i]=sc.nextInt();
    9         int money=sc.nextInt();
   10         System.out.println(juices(arr,money));
   11     }
   12     public static int juices(int[] arr,int money){
   13         Arrays.sort(arr);
   14         int sum=0,i;
   15         for(i=0;i<arr.length;i++){
   16             sum+=arr[i];
   17             if(sum>money)
   18                 return i;
   19             else if(sum==money)
   20                 return i+1;
   21         }
   22         return i;
   23     }
   24 }
