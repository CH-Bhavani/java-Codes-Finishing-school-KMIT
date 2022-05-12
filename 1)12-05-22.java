/*

The season of the vivas are ON!! There are a number of student in a class.Each class of the
students has to give viva, but there is one rule teacher have decided to choose the student 
whose turn it will to give viva, The teacher is picking certain rollnumbers form the list of the 
students. 

On each day, studnet with high rollnumbers than his left student's rollnumer will be picked to 
give viva on that day. 

Determine the number of days after which no studnet from the initial picking is remaining to give
viva, i.e the time after which there is no student with higher roll number on his left.

input =
4
3 6 7 5

rollnumber of student randomly picked initially amongst all students

Use a 1-indexed array for result.

On day 1, rollnumber 6 and 7 will be picked to give viva 
remianing rollnumbers=[3,5].
On day 2, rollnumber 5 will be picked for viva 
remianing rollnumbers=[3]. 

There is no student with a higher rollnumber than one to its left, so that batch will be over 
with the viva and will be ready to enjoy the vacations.


input =
7
6 5 8 4 7 10 9
output = 2

Explaination
rollnumbers={6,5,8,4,7,10,9}
on 1st day 8,7,10 will be picked and remaining students are 4 for viva
remining after 1st day rollnumber={6,5,4,9}
One the 2nd day 9 will be picked and remaining students are 3 for viva 
remaining after 2nd day rollnumber={6,5,4}

There is no student with a higher rollnumber than one to its left, so that batch will be over with the viva and will be ready to enjoy the vacations.


*/

import java.util.*;
public class test{
    static int c=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++ ) a[i]=sc.nextInt();
        ArrayList<Integer> al= new ArrayList<>();
        for(int i:a) al.add(i);
        nop(al);
    }
  static void nop(ArrayList<Integer> al){
         int f=0;
        ArrayList<Integer> nal= new ArrayList<>();
        ArrayList<Integer> al1= new ArrayList<>();
       nal.add(al.get(0));
        for (int i=1;i<al.size();i++){
            if(al.get(i) > al.get(i-1)){
                f++;
                al1.add(i);}
            else{
            nal.add(al.get(i));}
        }
        for(int i=0;i<al.size();i++) if(al1.contains(al.get(i))) al.remove(i);
        //System.out.println(al);
        if(f==0) System.out.println(c);
        else{ c++;
            nop(nal);}
    }
}
