/*write a program to read a postive input 'n' from the user and print the following pattern 

Assume the input 'n' will always be a postive integer 

input = 5
output = 
A*1
B*C*3*2
D*E*F*6*5*4
G*H*I*J*10*9*8*7
K*L*M*N*O*15*14*13*12*11
 
Note - If in the above pattern if the alphabet exceed 'Z' then start print again from 'A'

*/


import java.util.*;
class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        int ascii=65;
        int num=1;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)ascii+"*");
                ascii++;
                sum++;
                if(ascii==91){
                    ascii=65;
                }
            }
            count=sum;
            for(int j=i;j>=0;j--){
                if(j!=0){
                System.out.print(count+"*");
                }
                if(j==0){
                    System.out.print(count);
                }
                count--;
            }
            System.out.println();
        }
        
    }
}
