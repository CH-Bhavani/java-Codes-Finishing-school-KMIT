/*



In a South Africa Class room, each student has a name with a single character. 
Initally all the students names will be given. The teacher now wants the students 
to be shuffled, so that two students names that are adjacent to each other are not same. 

If the names can be shuffled in such a way print yes else  prints no. 

input=ddt
output=yes


Explanation -the student names can be shuffled as dtd


input=rrrt
output=no

Explanation - the studens names after shuffling will have same student names adjacent to each other 





*/



import java.util.*;
class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> hs=new HashMap<>();
        for(char c:str.toCharArray()){
            if(hs.containsKey(c))
                hs.put(c,hs.get(c)+1);
            else
                hs.put(c,1);
        }
        int max=-1;
        for(Integer e: hs.values()){
            if(e >max)
                max=e;
        }
        if(max<=str.length()-max+1)                       //important point to remenber
            System.out.println("yes");
        else
            System.out.println("no");
}
}
