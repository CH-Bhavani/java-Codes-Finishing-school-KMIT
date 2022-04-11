/*



[4:30 PM, 4/11/2022] bhavani~ch❣: A Kid is arranging a structure using building blocks, 
by placing individual building-block adjacent to each other.

A building-block is a vertical alignment of blocks.
		                            _
here one block each represents  as |_|.

The following structure made up of using building blocks

                      _
                  _|_|    _
                 |_|_|w|_|_              _
              _|_|_|_|_|_| w   w  w |_| 
          _|_|_|_|_|_|_|w|_|_w|_|____

            0  1   3   4   2   3    2   0   1   0   2

Once the structure is completed, kid pour water(w) on it.

You are given a list of integers, heights of each building-block in a row.
Now your task How much amount of water can be stored by the structure.


Input Format:
-------------
Space separated integers, heights of the blocks in the structure. 

Output Format:
--------------
Print an integer, 


Sample Input:
-------------
0 1 3 4 2 3 2 0 1 0 2
    
Sample Output:
--------------
6
    
Explanation:
-----------
In the above structure,  6 units of water (w represents the water in the structure)
can be stored.
[4:30 PM, 4/11/2022] bhavani~ch❣: IPL Has decided to have cricket Matches during this summer.
They are planning to have N matches. Each Match starts and ends in a particular time slot. 

 You are given an array of time slots of the N matches, consisting of
 begin and end times (b1,e1),(b2,e2),... (b < e ).
 Your task is to determine minimum number of cricket stadiums required 
 to conduct all the matches smoothly.
 
 NOTE: If a match begins at time 'a' ends at time 'b', 
 another match can start at 'b'.
 The first line of input consists of N number of matches followed by a 'N' pairs,
 where each pair indicates the begin and end time of each match. 


 
 Sample Input-1:
---------------
3
0 30
5 10
15 20

Sample Output-1:
----------------
2

Sample Input-2:
---------------
3
0 10
15 25
25 35

Sample Output-2:
----------------
1

*/





import java.util.*;
class Prog2{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
            end[i]=sc.nextInt();
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        System.out.print(minst(n,start,end));
    }
    public static int minst(int n,int[] s,int[] e){
        int count=0;
        int end=0;
        for(int i=0;i<n;i++){
            if(s[i]<e[end]){
                count++;
            }
            else{
                end++;
            }
        }
        return count;
    }
}
