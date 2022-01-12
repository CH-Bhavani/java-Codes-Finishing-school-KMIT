/*


Scott a Third class is given the scores of the students. He is the leader of the class. 
His teachers calls him and asks him to call the nth smallest Score secured by the student. 
Help scott solve the problem. 

If no such thing exists print -1. 

input = 47912478
3
output = 4

in the above test case we have 4 as the third smallest score secured by the student.

input = 1111
2
output = -1

in the above test case we dont have any second smallest score secured by the student so output is -1


input = 100
1
output = 0

in the above test case we have 0 as the first smallest score by the student so the output is 0 


*/



import java.util.*;
public class nthsmallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int ns=sc.nextInt();
        Set<Character> ts=new TreeSet<>();
        for(char c: str.toCharArray())
            ts.add(c);
        char arr[]=new char[str.length()];
        Iterator<Character> itr=ts.iterator();
        int i=0;
        while(itr.hasNext()){
            arr[i]=itr.next();
            i++;
        }
        if(ns>ts.size())
            System.out.println("-1");
        System.out.println(arr[ns-1]);
    }
}
