/*


Ravi is generating a binary sequenence for given n by using following rules:

first number in sequence="0"
other numbers can be find using the following formula
s[i]=s[i-1]+"1"+reverse(invert(s[i-1]))  for every i >0

here + means concatenation 
reverse(x) returns the reversed string x 
invert(x) inverts all the bits in x ( 0 changes to 1 and 1 changes to 0 ).

first four strings in the above sequence are:

for n=1 then "0"
for n=2 then "011"
for n=3 then "0111001"
for n= 4 then "011100110110001"

after generting sequence ravi should read the value of k and return kth bit for 
nth sequence string

input =3
3
output =1
for n=3 then sequence is "0111001" and 3rd bit is 1


input = 4
12
output =0 then sequence is "011100110110001" and 12th bit is 0


*/




import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        StringBuilder sb=new StringBuilder("0");
        for(int i=1;i<n;i++)
        {
            reverse(sb);
        }
        System.out.println(sb.charAt(p-1));
        
    }
    public static void reverse(StringBuilder sb)
    {
        StringBuilder t=new StringBuilder();
            for(int j=0;j<sb.length();j++)
            {
                if(sb.charAt(j)=='1')
                {
                    t.append('0');
                }
                else
                {
                    t.append('1');
                }
            }
            t.reverse();
            sb.append("1");
            sb.append(t);
    }
}
