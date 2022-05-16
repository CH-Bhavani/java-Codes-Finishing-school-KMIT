/*


Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:
Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.

input format:
input =
6
0 1 2 4 5 7
output =
0->2
4->5
7
first read the size of the array , followed by elements

Example 2:
Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

input = 
7
0 2 3 4 6 8 9
output =
0
2->4
6
8->9




*/


import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]arr=new int[m];
        for(int i=0;i<m;i++){
                arr[i]=sc.nextInt();
            }
        List<String> fin=ranges(arr,m);
        for(String s:fin){
            System.out.print(s+" ");
        }
    }
    public static List<String> ranges(int[]arr,int m){
        if(m==0|| m==1){
            List<String> l= new ArrayList<>();
            for(int a:arr){
                l.add(String.valueOf(a));
            }
            return l;
        }
        int low=0,i;
        List<String> l=new ArrayList<>();
        for(i=1;i<m;i++){                        //Input:  [0,1,2,4,5,7]Output: ["0->2","4->5","7"]
            if(arr[i]!=arr[i-1]+1){
                if(arr[low]==arr[i-1]){
                    l.add(arr[low]+"");
                    low=i;
                }
                else{
                    l.add(arr[low]+"->"+arr[i-1]);
                    low=i;
               }
            }
        }
        if(arr[low]==arr[i-1]){
            l.add(arr[low]+"");
            low=i;
        }
        else{
            l.add(arr[low]+"->"+arr[i-1]);
            low=i;
        }
        return l;
        
    }
}
