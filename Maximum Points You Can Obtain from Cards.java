/*


There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

input =7
1 2 3 4 5 6 1
3
output =12

Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. 
The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.


input =3
2 2 2 
2
output =4

Explanation: Regardless of which two cards you take, your score will always be 4.

input =7
9 7 7 9 7 7 9
7
output =55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.



*/







import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<s;i++) arr[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(maximum_score(arr,k,s));
    }
    public static int maximum_score(int[] arr,int k,int n){
        int ws=n-k,wv=0,sum=0;
        for(int i=0;i<n;i++)sum+=arr[i];
        for(int i=0;i<ws;i++) wv+=arr[i];
        int min=wv;
        for(int i=ws;i<n;i++){
            wv+=arr[i]-arr[i-ws];
            min=Math.min(min,wv);
        }
        return sum-min;
    }
}
