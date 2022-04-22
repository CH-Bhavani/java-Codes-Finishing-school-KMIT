/*


srinivas is trying to rearrange characters in word based on frequency 
of each character repeated number of times in that particular word.

example:
input =stff
output =ffst


input =fffbbb
output =fffbbb

both f and b appear three times , so answer would be fffbbb or bbbfff.
return in insertion order of when they both are same frequency. 
 
input =caAc
output =ccaA



*/




import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(rearrangeChar(s));
}
public static String rearrangeChar(String w){
    LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
    HashMap<Character,Integer> ind=new HashMap<>();
    for(int i=0;i<w.length();i++){
        char c=w.charAt(i);
        if(!ind.containsKey(c))
            ind.put(c,i);
        hm.put(c,hm.getOrDefault(c,0)+1);
    }
    System.out.println(hm+" "+ind);
    PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
    for(char i:w.toCharArray())
        pq.offer(i);
    StringBuilder sb=new StringBuilder();
    for(char c:pq){
        sb.append(c);
    }
    return sb.toString();
}
}
