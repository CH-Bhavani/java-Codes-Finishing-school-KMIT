/*



Given two Integer ArrayList, add their elements to a new ArrayList by satisfying following conditions 

1. Addition should be done starting from 0th index of both ArrayList.
2. Split the sum if it is a not a single digit number and store the digits in adjacent locations
3. Output ArrayList should accommodate any remaining digits of larger input ArrayList.
4.Assume the input contains only positive numbers

Examples:
First line contains the size of first ArrayList followed by first ArrayList elements followed by second ArrayList size followed by 
second ArrayList elements 


input =
6
9 2 3 7 9 6
8
3 1 4 7 8 7 6 9
output =
1 2 3 7 1 4 1 7 1 3 6 9

input = 
6
9343 2 3 7 9 6
8
34 11 4 7 8 7 6 99
output =
9 3 7 7 1 3 7 1 4 1 7 1 3 6 9 9

input = 
3
345 124 54
5
123 221 325 4234 5167
output = 
4 6 8 3 4 5 3 7 9 4 2 3 4 5 1 6 7



*/




import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<s1;i++)
            a1.add(sc.nextInt());
        int s2=sc.nextInt();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<s2;i++)
            a2.add(sc.nextInt());
        ArrayList<Character> a3= add(a1,s1,a2,s2);
        for(char a:a3)
            System.out.print(a+" ");
    }
    public static ArrayList<Character> add(ArrayList<Integer> a1,int s1,ArrayList<Integer> a2,int s2){
        ArrayList<Character> fin=new ArrayList<>();
        int i=0,j=0,sum=0;
        while(i<s1||j<s2){
            if(i<s1){
                sum=sum+a1.get(i);
                i++;
            }
            if(j<s2){
                sum=sum+a2.get(j);
                j++;
            }
            String s=String.valueOf(sum);
            for(char c:s.toCharArray())
                fin.add(c);
            sum=0;
        }
        return fin;
    }
}
