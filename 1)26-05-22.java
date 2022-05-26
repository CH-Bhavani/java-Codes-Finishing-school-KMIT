/*

Mr X is a teacher of maths. He came across a very simple problem. 
In the problem you have to arrange the numbers in an ascending order and calculate the total number of swaps required. 
The number of swaps must be minimum. 
But Mr X is busy with some other tasks and you being his favourite student , so he asks you to solve this problem.

Input Format
First line contains the number n.
n space separated integers

Constraints
1<=T<=100
1<=N<=100
1<=A[ ] <=1000

Output Format
Print the answer on the first line

input =4
4 3 1 2
output =2
 
Explanation
Swap index 0 with 3 and 1 with 2 to form the sorted array {1, 2, 3, 4}.

*/



import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(minSwaps(arr,n));
    }
    static int minSwaps(int[] arr, int N)
    {
        int c = 0;
        int[] temp= Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++)
        {
            if (arr[i] != temp[i])
            {
                c++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return c;
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ele) return i;
        }
        return -1;
    }
}
