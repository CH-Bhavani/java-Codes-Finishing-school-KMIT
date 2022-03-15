/*

Mike has a iPhone. His iPhone has a Number Lock of 4 digits. 
The keypad has been disabled and the numbers can scroll. 
Each Scroll consists of Numbers(0-9). 
It can be done from 0 to 9 or 9 to 0. 

The phone has some Dead Ends, if any one tries to open the lock and falls in the Dead End, 
the phone resets to the initial state and all information is lost. 

Initially, the number lock is set to 0000.
and you will be given the unlock key, your task to find and print
the minimum number of rotations required to unlock the phone,
If it is not possible to unlock  without reseting to the Initial State, print -1.

NOTE:
In one rotation you can choose any one wheel and 
rotate to its next or previous digit.

input=0302 0202 0203 2323 3003
0303 
output=8

Explanation:
------------
To unlock the valid possible rotations are as follows:
0000 > 1000 > 1100 > 1200 > 1201 > 1202 > 1302 > 1303 > 0303.




input=6656 6676 6766 6566 5666 7666 6665 6667
6666 
output=-1


Explanation:
------------
You can't unlock

*/

import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=sc.nextLine().split(" ");
        String target=sc.next();
        System.out.println(openLock(arr,target));
    }
    public static int openLock(String[] deadends, String target) {
        Set<String> visited = new HashSet<>();
        for(String deadend: deadends){
            visited.add(deadend);
        }
        
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        int level = 0;
        
        while(q.size() > 0){
            int size = q.size();
            while(size-- >0){
                String currentLock = q.poll();
                if(visited.contains(currentLock)) continue;
                if(currentLock.equals(target)) return level;
                
                for(String nextLock: getNextStates(currentLock)){
                    if (!visited.contains(nextLock)) q.offer(nextLock);
                }
                visited.add(currentLock);
            }
            level++;
        }
        return -1;
    }
    
    private static Set<String> getNextStates(String lock) {
        Set<String> newLocks = new HashSet<>();
        char[] lockChar = lock.toCharArray();
        for (int i = 0; i < 4; i++) {
            char c = lockChar[i];
            lockChar[i] = c == '9' ? '0' : (char) (c + 1);
            newLocks.add(new String(lockChar));
            lockChar[i] = c == '0' ? '9' : (char) (c -1);
            newLocks.add(new String(lockChar));
            lockChar[i] = c;
        }
        return newLocks;
    }
    
}
