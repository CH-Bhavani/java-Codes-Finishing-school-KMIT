/*

Given a sorted integer array nums, where the range of elements 
are in the inclusive range [lower, upper], return its missing ranges.
Example:
Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
Output: ["2", "4->49", "51->74", "76->99"]

input format:
input =
5
0 1 3 50 75
0
99
output =
2
4->49
51->74
76->99

first line reads the size of array elements
second line reads the elements
third and fourth lines read lower value and upper values from the user.





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
        int l=sc.nextInt();
        int h=sc.nextInt();
        List<String> fin=ranges(arr,m,l,h);
        for(String s:fin){
            System.out.print(s+" ");
        }
    }
    public static List<String> ranges(int[]arr,int m,int lo,int h){
        List<String> l= new ArrayList<>();
        if(m==0){
            l.add(String.valueOf(lo+"->"+h));
            return l;
        }
        int i;
        if(arr[0]!=lo){
            if(lo+1==arr[0]){
                    l.add(lo+"");
                }
                else{
                    l.add((lo)+"->"+(arr[0]-1));
                }
        }
        for(i=1;i<m;i++){
            if(arr[i]!=arr[i-1]+1){
                if(arr[i-1]+1==arr[i]-1){
                    l.add(arr[i-1]+1+"");
                }
                else{
                    if(arr[i]-1<h){
                    l.add((arr[i-1]+1)+"->"+(arr[i]-1));
                    }
                    else{
                        l.add((arr[i-1]+1)+"->"+h);
                        return l;
                    }
            }
        }
    }
        if(arr[m-1]!=h){
            if(arr[m-1]+1==h){
                    l.add(h+"");
                }
                else{
                l.add((arr[m-1]+1)+"->"+(h));}
        }
        return l;
    }
}

  
