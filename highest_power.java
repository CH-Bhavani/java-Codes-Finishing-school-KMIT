/*


A Group of Monsters has few powers. 
The powers are represented in numbers both positive and negative. 
Each Member of the monster prays to get some power. 
God sanctions only one member of the Monster Group. 
The power can be performed only once on only one member of the monster. 
God will multipy the monster power with the same power. 
After  performing the above action, a sub-group of monsters check the power they have.
We have to now see which sub-group has the highest power. Print the Highest Sub-Power.


The first line of input contains the powers of the monsters. 

input = 4 -1 -5 -3
output = 28

The power operation is performed on the third monster, -5 * -5 which is 25 

Now the sub group with highest power is 4+(-1)+25 = 28 




*/



import java.util.*;
class monster{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int n=str.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(str[i]);
        System.out.println(test(arr,n));
    }
    public static int test(int[] a,int n){
        ArrayList<Integer> ar=new ArrayList<>();
        int ind=-1,max=0;
        for(int i=0;i<n;i++){
            if(a[i]*a[i]>max){
                max=a[i]*a[i];
                ind=i;
            }
        }
        ar.add(max);
        int sum1=max,sum2=max;
        for(int j=0;j<ind;j++){
            sum1+=a[j];
        }
        ar.add(sum1);
        for(int k=ind+1;k<n;k++){
            sum2+=a[k];
        }
        ar.add(sum2);
        return Collections.max(ar);
    }
}
