/*


Siddarth is working with a list of integers, 0-indexed list.
The list is said to be decent list, if the sum of the inteers at odd indices
equal to the sum of integers at even indices in the list.

Now, siddarth can choose any index position, and delete the element from the list.
and check whether the resultant list is a decent list or not.
Due to the deletion of an element, the index postions may vary.

For example, if the list is [2,1,3,4,1] :
- delete the element at index 1 => list is [2,3,4,1]
- delete the element at index 2 => list is [2,1,4,1]
- delete the element at index 3 => list is [2,1,3,1]
- delete the element at index 4 => list is [2,1,3,4]

Siddarth has to find out how many indices you can remove one at a time and,
check that the resultant list becomes a decent list.

Your task is to help siddarth to find the count of all such indices.

Input Format:
-------------
Line-1: An integer N, number of elements in the list.
Line-2: N space separated integers, the list.

Output Format:
--------------
Print an integer, number of indices you can find.


Sample Input-1:
---------------
5
1 2 2 1 2

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5
2 2 2 2 2

Sample Output-2:
----------------
5


Sample Input-3:
---------------
4
3 2 7 5

Sample Output-3:
----------------
1


*/


import java.util.*;

public class test{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<Integer> arr=new ArrayList<>();
      for(int i=0;i<n;i++)
        arr.add(sc.nextInt());
    System.out.println(odd_even_sum(arr,n));
  }  
  public static int odd_even_sum(ArrayList<Integer> arr,int n){
        int es=0,os=0,count=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
                es+=arr.get(i);
            else 
                os+=arr.get(i);
        }
        if(es==os) 
            count++;
        for(int j=0;j<n;j++){
            es=0;
            os=0;
            int temp=arr.remove(j);
            for(int i=0;i<arr.size();i++){
                if(i%2==0) es+=arr.get(i);
                else os+=arr.get(i);
            }
            if(es==os)
                count++;
            arr.add(j,temp);
        }
        return count;
  }
}
