/*

It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n, where 
costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to 
spend, and he wants to buy as many ice cream bars as possible. 

Return the maximum number of ice cream bars the boy can buy with coins coins.

Note: The boy can buy the ice cream bars in any order.

 

Example 1:

input =5
1 3 2 4 1
7
output = 4
Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a 
total price of 1 + 3 + 2 + 1 = 7.


Example 2:

input =6
10 6 8 7 7 8
5
output = 0
Explanation: The boy cannot afford any of the ice cream bars.

Example 3:
input =6
1 6 3 1 2 5
20
output =6
Explanation: The boy can buy all the ice cream bars for a 
total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.



*/





import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int c=sc.nextInt();
    System.out.println(iceCreams(arr,n,c));
    }
    public static int iceCreams(List<Integer> l,int n,int c){
        Collections.sort(l);
        int count=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=l.get(i);
            count++;
            if(sum>c){
                return count-1;
            }
            else if(sum==c)
                return count;
        }
        return sum<c?n:0;
    }
}
