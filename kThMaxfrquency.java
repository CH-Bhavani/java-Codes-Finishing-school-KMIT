/*




write a java program to read the number in string format and print the nth largest digit based on frequency.

print -1 for other bounday conditions.
print the elements in the order they occur in the string


example:
123412213
2
output =
3

explanation:
frequency of 1 is 3
frequency of 2 is 3
frequency of 3 is 2, so print 3


input =
91791727198317319923381
3
output =
9
7
explanation:
frequency of 9 is 5
frequency of 1 is 5
frequency of 7 is 4
frequency of 3 is 4
frequency of 2 is 2
frequency of 8 is 2, so print 2 and 8( in the order they occur insertion order)


input = 456
3
output = -1

here we dont have second frequency count so print -1

input = 11
5
output = -1


*/





import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int m=sc.nextInt();
        kmax(s,m);
    }
    public static void kmax(String  s,int m){
        HashMap<Character,Integer> first=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            first.put(s.charAt(i),first.getOrDefault(s.charAt(i),0)+1);
        }
        Map<Integer,ArrayList<Character>> second=new TreeMap<>();
        for(Map.Entry me:first.entrySet()){
            if(second.containsKey(me.getValue())){
                ArrayList<Character> a=second.get(me.getValue());
                char ch=(char)me.getKey();
                a.add(ch);
                second.put((int)me.getValue(),a);
            }
            else{
                second.put((int)me.getValue(),new ArrayList<Character>());
                ArrayList<Character> a=second.get(me.getValue());
                char ch=(char)me.getKey();
                a.add(ch);
                second.put((int)me.getValue(),a);
            }
    }
    ArrayList<Integer> a=new ArrayList<>(second.keySet());
    if(second.size()-m<0 )
        System.out.println("-1");
    else{
        ArrayList<Character> temp=second.get(a.get(second.size()-m));
        for(char t:temp)
            System.out.print(t+" ");
    }

    }
}


