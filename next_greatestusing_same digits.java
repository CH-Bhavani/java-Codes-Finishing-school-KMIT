/*

Kalpana a third class student is playing with numbers. 
She has given her brother the same set of numbers and asked him to find the 
next greatest nearest number which contains the same set of digits same number of times. 

If no such number exists print -1 

input = 121
output = 211

input = 653
output = -1


input = 456
output = 465




*/





import java.util.*;
public class playing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        next_max(n);
    }
    public static void next_max(String str){
        char []arr=str.toCharArray();
        int i;
        for(i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                break;
            }
        }
            if(i==0)
                System.out.println("-1");
            else{
                int x=arr[i-1];
                int y=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>x && arr[j] <arr[y])
                        y=j;
                }
                char temp=arr[i-1];
                arr[i-1]=arr[y];
                arr[y]=temp;
                Arrays.sort(arr,i,arr.length);
                for(char ch:arr)
                    System.out.print(ch);
            }
    }
    
}
