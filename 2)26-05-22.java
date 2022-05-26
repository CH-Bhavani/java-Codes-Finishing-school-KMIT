/*




In special MATHS where there is no rule of operator precedence. 
All operators have equal precedence. 

If + comes before * then + should perform before *.

for given input 1-2*3 

in general maths gives -5 as answer , but in special MATHS it is -3
Evaluate the given string 

string has only numbers (1 to 9) , operators(+,-,*,/)
Between every number there will be a operator

input =1-2*3
output =-3

input =
1+2-3*4
output =0


*/


import java.util.*;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[]=s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        List<String> al=new ArrayList<String>();
        for(String i:a)
            al.add(i);
      calc(al);
    }
    static void calc(List<String> al){
        int a=Integer.parseInt(al.get(0));
        String op=  al.get(1);
        int b=Integer.parseInt(al.get(2));
        int temp=cal(a,op,b);
        al.remove(0);
        al.remove(0);
        al.set(0,String.valueOf(temp));
        if(al.size() >1) calc(al);
        else if(al.size() ==1){
            System.out.println(al.get(0));}
    }
    static int cal(int a,String op,int b){
        switch (op){
            case "+":return a+b;
            case "-":return a-b;
            case "*":return a*b;
            case "/":return a/b;
        }
        return -1;
    }
}
