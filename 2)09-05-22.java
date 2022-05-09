/*Ram and Shyam are siblings. Their father given puzzle for them, which contains n blocks. 
There is a word S written in each block of the puzzle. All the words written is not need
to be unique. Ram was playing with puzzle and make a queue with the blocks.
But instead of adding in end of the queue, he insert the block in between. 
After finishing with all the blocks, he stopped and left the puzzle. 
Few time later, Shyam came and saw the puzzle. He remove M words A1,A2,A3,...,AM from the queue. 

You have been provided the value of N and M and strings S and their 
corresponding position X and strings Ai. Can you show the current 
situation of the puzzle after Shyam edit? it is possible that, Shyam removed 
all the blocks and made the queue empty. In such case, print "-1". 

First line of each testcase contains N, number of blocks in the puzzle blocks set. 
Next N line follows a word S and an integer X. 

In the Next line, there will be another integer M. After that, there are M lines. 
i th line denotes the string Ai. 

Output: In each line, print the strings of the blocks in the remaining queue after
Shyam edit. If there is no elements in queue found, print -1. 

input =
5
abc 1 
acc 2
bcccb 2
aaa 3
bcccb 1
1
bcccb
output =
abc
aaa
acc
Explanation:  siblings have a puzzle blocks set having 5 blocks. 
You know the first one is the one which forms the queue. 
So I can leak that, for the first block, the value of X is always 1. 
So, Ram placed abc in the first place. Then he added acc in the second position since X=2. 
The queue looks like {abc, acc} now. 
Then he added bcccb on 2nd position. The queue is now {abc, bcccb, acc}. 
Next aaa is inserted in 3rd position. The queue is now {abc, bcccb, aaa, acc). 
The last block with the string bcccb was added in the first position resulting the queue like 
{bcccb, abc, bcccb, aaa, acc}. 
Now shyam came. As he dislike the string bcccb,

he removed all the blocks containing bcccb and now finally, the queue looks like { abc, aaa, acc}. 

*/



import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> l=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            String ele=sc.next();
            int ind=sc.nextInt();
            l.add(ind-1,ele);
        }
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
            l.removeAll(Collections.singleton(sc.next()));
        if(l.isEmpty())
            System.out.println("-1");
        else
            for(String j:l)
                System.out.println(j);
    }
}
