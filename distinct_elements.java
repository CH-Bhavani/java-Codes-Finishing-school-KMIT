/*


Srinivas is playing with array of numbers.
he has to print distinct element from every subarray size of k.

example:
input =7
1 2 3 2 2 1 3
3
output =3 2 2 2 3

number of distinct elements in each subarray of k size is as follows:
here size of subarray is 3 so
consider first 3 elements [1,2,3] so ans = 3(3 elements are distinct)
consider next 3 elements  [2,3,2] so ans=2(elements are distinct ie 2 and 3)
consider next 3 elements[3,2,2] so ans =2
consider next 3 elements[2,2,1] so ans =2
consider next 3 elements[2,1,3] so ans =3

return result=[3,2,2,2,3]


intput =7
1 1 1 1 2 3 4
4
output=1 2 3 4 

Explanation: The number of distinct elements in each subarray goes as follows:
[1,1,1,1] so ans[0] = 1
[1,1,1,2] so ans[1] = 2
[1,1,2,3] so ans[2] = 3
[1,2,3,4] so ans[3] = 4

*/





import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int k=sc.nextInt();
        distinct_elements(arr,n,k);
        
    }
    public static void distinct_elements(int[] arr,int n,int k){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n-k+1;i++){
            hs.clear();
            for(int j=i;j<i+k;j++){
                hs.add(arr[j]);
            }
            System.out.print(hs.size()+" ");
        }
    }
}
