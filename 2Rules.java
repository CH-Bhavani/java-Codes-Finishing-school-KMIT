/*
`Raju is given an Binary rows of numbers(0/1).
He applies the following rules,
Rule1-Changing the row [ 1 1 0] will give [ 0 1 1]
Rule2-Interchange 1-0/0-1

Apply the above two rules and give raju a new binary rows

input=3 3
1 1 0
1 0 1
0 0 0
output=1 0 0
0 1 0
1 1 1

The first line of input contains the numbers of the row followed by each individual row size followed by row elements


*/






import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
        arr[i]="";
        int idx=0;
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder("");
            for(int j=0;j<m;j++)
            {
                char a=sc.next().charAt(0);
                sb.append(a);
            }
            sb.reverse();
            String s=String.valueOf(sb);
                String updated=Interchange(s);
                arr[idx++]=updated;
        }
        display(arr);
        
    }
    public static String Interchange(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='0')
            sb.setCharAt(i,'1');
            else
            sb.setCharAt(i,'0');
        }
        return String.valueOf(sb);
    }
    public static void display(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                System.out.print(arr[i].charAt(j)+" ");
            }
            System.out.println();
        }
        
    }
    
}
