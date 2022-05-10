

/*




Given a class name Candidate which implements Comparable interface. 
In Candidate class there fields present.
private String name;'
private String marks;
and you have given a list of Object type Candidate which is unsorted.
You need to initialise the constructor and overwrite the compareTo method so that after using collections.sort(list)
should be sorted in ascending order based on marks.


use template and uncomplete code snipped:

class Candidate implements Comparable<Candidate>
{
  private String name;
  private int marks;

   public Candidate(String name, int marks){
     // write your code here

   }
}

  @Override
   public int compareTo(Candidate candidate){
     // write your code here


    }

  //create getter for both fields
  //setter method name mucst be setName() ,setMarks()
  //getter method name must be getName(),getMarks()
  //write your code here
 
}
// create a Test class and read 'n' number of Candidate objects with name and marks
// add all the candidates to ArrayList<Candidate>
// do sorting the Candidates using Collections.sort(list); ascending of their marks
//print after sorting



input =2
Ram 20
Shyam 10
output =
Shyam 10
Ram 20

input =3
abc 30
def 10
ghi 20
output =
def 10
ghi 20
abc 30
*/





import java.util.*;
class Candidate implements Comparable<Candidate>
{
  private String name;
  private int marks;

   public Candidate(String name, int marks){
     // write your code here
     this.name=name;
     this.marks=marks;

   }
  @Override
   public int compareTo(Candidate candidate){
     // write your code here
     return this.marks-candidate.marks;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    // public String toString(){
    //     return name+" "+marks;
    // }

}
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Candidate> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Candidate(sc.next(),sc.nextInt()));
        }
        Collections.sort(arr);
        // for(int i=0;i<arr.size();i++){   
        //     System.out.println(arr.get(i));  // uses tostring()
        // 
        //}
        for(Candidate c:arr){
            System.out.println(c.getName() +" "+c.getMarks());
        }
    }
}

