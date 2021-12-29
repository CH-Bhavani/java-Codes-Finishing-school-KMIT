/*
Ramu a School boy given a number 'n' writes it vertically down and writes up again verically up (n-1) lines in increasing order of 1.
He Repeats the above process continously. 


input = 5
output =
1
2 9
3 8 10
4 7 11 14 
5 6 12 13 15



input = 6
output = 
1
2 11
3 10 12
4 9 13 18
5 8 14 17 19
6 7 15 16 20 21
*/




import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int j;
        for(int i=0;i<num;i++){
            for(j=0;j<=i;j++){
                int x=0;
                for(int v=0;v<j;++v){
                    x=x+num-v;
                }
                if(j%2==0){
                    System.out.print(x+i-j+1+" ");
                }
               else
               System.out.print(x+num-i+" ");
            }
            System.out.println();
        }
}
}
