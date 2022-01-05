/*
There are N players, playing a game.

You are given the scores of the N players as scores[] array,
where i-th player score is score[i].

You are given P chances to modify the score of the players.

In each chance you can modify the score of i-th player as follows:
	- You are allowed increment the score of i-th player by 1.

You have to perform these increments, in order to maximize the occurances of any score.

Your task is to maximize occurances of a score, after utlizing atmost P chances.

Input Format:
-------------
First line of input consists of the scores followed by the number of chances(P)

Output Format:
--------------
Print an integer, maximum occurances of a score!


Input = 1 2 4 
5
Output = 3

Explanation: Increment the first score three times and the second score two times to make scores = [4,4,4].
4 has a maximum of 3 occurances



Example 2:
Input  = 1 4 8 13
5
Output: 2

Explanation: There are multiple optimal solutions:

- Increment the first score three times to make scores = [4,4,8,13]. 4 has a maximum occurance of 2.
- Increment the second score four times to make scores = [1,8,8,13]. 8 has a maximum occurance of 2.
- Increment the third score five times to make scores = [1,4,13,13]. 13 has a maximum occurance of 2.




*/







import java.util.*;
public class maximum{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s[]=sc.nextLine().split(" ");
    int k=sc.nextInt();
    int [] arr=new int[s.length];
    for(int i=0;i<s.length;i++)
        arr[i]=Integer.parseInt(s[i]);
    System.out.println(max_occurences(arr,k));
    
    }
    public static int max_occurences(int[] a,int k){
        Arrays.sort(a);
        int max=0;
        for(int i=a.length-1;i>=0;i--){
            int temp=k;
            int count=1;
            for(int j=i-1;j>=0;j--){
                if(temp-(a[i]-a[j])>=0){
                    count++;
                    temp-=(a[i]-a[j]);
                }
            }
                if (max<count)
                    max=count;
            }
        return max;
        }
}
