/*

Shyam a Fifth class boy is working on numbers, Given few numbers 
he has to construct a new number which is greatest number. 

The first line of input contains the size of the numbers followed by the numbers

input = 2
50 7
output = 750

input = 5
3 30 34 5 9
output = 9534330

*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<String> arr=new Vector<>();
        for(int i=0;i<n;i++) arr.add(sc.next());
        Largest_num(arr,n);
    }
    public static void Largest_num(Vector<String> a,int n){
        Collections.sort(a, new Comparator<String>()
        {
            @Override public int compare(String x, String y){
                String xy=x+y;
                String yx=y+x;
                return xy.compareTo(yx)>0?-1:1;
            }
        });
        Iterator i=a.iterator();
        while(i.hasNext())
            System.out.print(i.next());
    }
}
