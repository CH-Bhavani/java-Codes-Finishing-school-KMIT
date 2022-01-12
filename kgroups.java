/*



Shyam is given a group of numbers and a value(k),Now he wants to see if the group of numbers 
can be arranged into sets of k consecutive groups. 

if he can do print yes else print no 

The first line of input consists of the group of numbers followed by a value (k) 

input = 1,2,3,3,4,4,5,6
4
output = yes

Explanation: Group can be arranged into (1,2,3,4) and (3,4,5,6)


Input = 3 2 1 2 3 4 3 4 5 9 10 11
3
output = yes

Explanation: Group can be arranged into (1,2,3) , (2,3,4) , (3,4,5) and (9,10,11).

Input = 1 2 3 4 
3
output = no


Explanation: Each group should be arranged in sub-group of size 3.



*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int n=sc.nextInt();
        int[] arr=new int[str.length];
        for(int i=0;i<str.length;i++)
            arr[i]=Integer.valueOf(str[i]);
        System.out.println(group(arr,n));
    }
    public static String group(int[] nums, int k) {
        if(nums.length % k != 0) return "no";
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i: nums) map.put(i, map.getOrDefault(i, 0)+1);
        int i=0;
        for(i = 0; i < nums.length/k; i++) {
            Map.Entry<Integer, Integer> first = map.pollFirstEntry();
            map.put(first.getKey(), first.getValue()-1); 
            int temp = first.getKey();
            if(map.get(temp) == 0) map.remove(temp); 
            for(int j = 1; j < k; j++) { 
                temp += 1; 
                if(!map.containsKey(temp))
                    return "no"; 
                else {
                    int con_key = temp;
                    map.put(con_key, map.get(con_key)-1); 
                    if(map.get(con_key) == 0) map.remove(con_key); 
                }
            }
        }
        return "yes";

    }
}
