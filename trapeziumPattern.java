/*  Number Rangoli 

Swathi Prints the following Number Rongoli 
for any given positive integer 'n'

Help Swathi in this regard

input=4
output=
1*2*3*4*17*18*19*20
--5*6*7*14*15*16
---8*9*12*13
----10*11


The output should contain only - and * numbers(0-9)


input=3
output=
1*2*3*10*11*12
--4*5*8*9
---6*7

*/



import java.util.*;
public class test{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        trapeziumPattern(n);
    }
    public static void trapeziumPattern(int num)
    {
        int firsthalf = 1;
        int secondhalf = (num * num) + 1;
        int numOfSpaces = 0;
        for (int numOfLines = num; numOfLines >= 1;
             numOfLines--) {
            for (int numOfSpacesCounter = numOfSpaces;
                 numOfSpacesCounter >= 1;
                 numOfSpacesCounter--) {
                System.out.print("-");
            }
            for (int firstHalfCounter = 1;
                 firstHalfCounter <= numOfLines;
                 firstHalfCounter++) {
                if (firstHalfCounter == numOfLines)
                    System.out.print((firsthalf++));
 
                else
                    System.out.print((firsthalf++) + "*");
            }
            for (int secondHalfCounter = 1;
                 secondHalfCounter <= numOfLines;
                 secondHalfCounter++) {
                System.out.print("*" + (secondhalf++));
            }
 
            System.out.println();
            numOfSpaces += 2;
            secondhalf
                = (secondhalf - 1) - ((numOfLines - 1) * 2);
        }
    }
}
