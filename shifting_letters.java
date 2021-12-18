/*Gene and Minne are playing with the words. 
Minne is always sure that his word will be equal to the Genes word, after moving few letters of the Genes word to the end.
Help Minne to solve the problem.

The first line of input contains the Genes word followed by Minne word. 
If it matches print true else print false


Sample Test Case - 1
input = abcde 
eabcd
output = true 


After performing the Genes word abcde-bcdea-cdeab-deabc-eabcd.


Sample Test Case - 2
input = abcdef
fedcba
output = false

Explanation -
After performing the Genes word  abcdef bcdefa cdefab defabc efabcd fabcde 
which doesnt match with the Minne word so the output is false */




import java.util.*;
public class equal{
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        String minne=sc.next();
        String gene=sc.next();
        char[] m=minne.toCharArray();
        char[] g=gene.toCharArray();
        System.out.println(checkifequal(g,m));
    }
    public static boolean checkifequal(char[] g,char[] m){
        for(int j=0;j<g.length;j++){
            char last=g[g.length-1];
            for(int i=g.length-1;i>0;i--){
                g[i]=g[i-1];
            }
            g[0]=last;
            if (Arrays.equals(m,g)){
                return true;
                
            }
         }
         return false;
}
}


