/*

create two threads , where the first thread reads the 
employee records(5) from the user .

Second thread will print the sum of all salaries of employees

input =
101 abc 5000
102 xyz 2000
103 ram 3000
104 shyam 1000
105 hari 2500
output = 13500





*/



import java.util.*;
import java.io.*;
class Employee{
    int empid;
    String ename;
    int esal;
    Employee(int empid,String ename,int esal){
        this.empid=empid;
        this.ename=ename;
        this.esal=esal;
    }
}
class test extends Thread{
    public static void main(String[] args){
        Employee[] emp=new Employee[5];
        Thread t1=new Thread(new Runnable(){
            public void run(){
                synchronized(emp){
                    Scanner sc=new Scanner(System.in);
                    for(int i=0;i<5;i++){
                        emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
                    }
                }
            }
        }
        );
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                synchronized(emp){
                   int sum=0;
                   for(int i=0;i<5;i++){
                       sum=sum+emp[i].esal;
                   }
                   System.out.print(sum);
                }
            }
        }
      );
      t1.start();
      t2.start();
    }
}
