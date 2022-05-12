/*

Find Maximum are for given sequence of plots
In a layout of plots, all plots are having equal width, which is 10 meters, but these

plots varies in length For a given sequence of plots lengths, you need find what is maximum
rectangle area you can make ?

Example


Max Area is 4*10*20 = 800 sq meters

input =30 40 25 20
output =800

input =20 20 20 60 10 50 40 20 20 20 20
utput
1200


*/

import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int[] arr=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.valueOf(s[i]);
        }
    System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int maxArea=0,area=0,i=0;
        for(i=0;i<arr.length;){
            if(stk.isEmpty() || arr[stk.peek()]<=arr[i]){
                stk.push(i++);
            }
            else{
                int top=stk.pop();
                if(stk.isEmpty()){
                    area=arr[top]*i;
                }
                else{
                    area=arr[top]*(i-stk.peek()-1);
                }
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }
        while(!stk.isEmpty()){
            int top=stk.pop();
            if(stk.isEmpty()){
                area=arr[top]*i;
            }
            else{
                area=arr[top]*(i-stk.peek()-1);
            }
            if(area>maxArea){
                    maxArea=area;
                }
        }
        return maxArea*10;
    }
}
