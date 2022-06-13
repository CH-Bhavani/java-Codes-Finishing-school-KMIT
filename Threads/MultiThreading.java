/*




Write a program  to read a value 'n' from the user and prints the string representation of numbers
from 1 to n,

however:
If the number is divisible by 3, output "Fizz".
If the number is divisible by 5, output "Buzz".
If the number is divisible by both 3 and 5, output "FizzBuzz".
If the number is not divisible by both 3 and 5 print the number 


input = 15
output =1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
            
input = 20
output =1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz

Implement a multithreaded version of FizzBuzz with three threads. 

The same instance of FizzBuzz will be passed to three different threads(T1,T2,T3):

1. Thread A(T1) will call printFizz() to check for divisibility of 3 and outputs Fizz
2. Thread B(T2) will call printBuzz() to check for divisibility of 5 and outputs Buzz .
3. Thread C(T3) will call printFizzBuzz() to check for divisibility of 3 and 5 and outputs 
FizzBuzz

The method printNumber() of the FizzBuzz Class should only output the numbers which are not 
divisible by 3 and 5


The Thread -T1 should have an Reference variable of FizzBuzz class and 
that should be initialized with the help of a Parametrized Constructor and
also implement the code for run() method 

Similarly Implement Thread (T2) and Thread(T3) ; 

Here the FizzBuzz class has four methods printFizz() , printBuzz() printFizzBuzz(), printNumber() 
all methods are synchronized 
Implement this four  method 

Some Portion of code is given  Write the remaining logic 






*/



import java.util.*;
class FizzBuzz{
	int i,n;
	FizzBuzz(int n)
	{
	i=1;
	this.n=n;
	}
	public synchronized void printFizz(){
            // write your code here
            try{
                while(i<=n){
                    if(i%3==0 && i%5!=0){
                        System.out.println("Fizz");
                        i+=1;
                        notifyAll();
                    }
                    else
                        wait();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());}
	}
	public synchronized void printBuzz(){
           // write your code here 
           try{
               while(i<=n){
                   if(i%5==0 && i%3!=0){
                       System.out.println("Buzz");
                       i+=1;
                       notifyAll();
                   }
                   else
                    wait();
               }
           }
           catch(Exception e){
            System.out.println(e.getMessage());}
	
	}
	public synchronized void printFizzBuzz(){
		// write your code here 
		try{
		    while(i<=n){
		        if(i%3==0 && i%5==0){
		            System.out.println("FizzBuzz");
		            i+=1;
		            notifyAll();
		        }
		        else
		            wait();
		    }
		}
		catch(Exception e){
		    System.out.println(e.getMessage());}

	}
	public synchronized void printNumber(){
		// write your code here 
		try{
		    while(i<=n){
		        if(i%3!=0 && i%5!=0){
		            System.out.println(i);
		            i+=1;
		            notifyAll();
		        }
		        else
		            wait();
		    }
		}
		catch(Exception e){
		    System.out.println(e.getMessage());}
	}
}


class T1 implements Runnable{
// write your code here 
    FizzBuzz fb;
    T1(FizzBuzz fb){
        this.fb=fb;
    }
    public void run(){
        fb.printFizz();
    }

}

class T2 implements Runnable{
	
// write your code here
FizzBuzz fb;
T2(FizzBuzz fb){
    this.fb=fb;
}
public void run(){
    fb.printBuzz();
}

}

class T3 implements Runnable{
// write your code here 
FizzBuzz fb;
T3(FizzBuzz fb){
    this.fb=fb;
}

public void run(){
    fb.printFizzBuzz();
}
	
}

class Test{
	public static void main(String[] args){
	    //write your code here
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    FizzBuzz obj=new FizzBuzz(n);
	    T1 t1=new T1(obj);
	    T2 t2=new T2(obj);
	    T3 t3=new T3(obj);
	    Thread th1=new Thread(t1);
	    th1.start();
	    Thread th2=new Thread(t2);
	    th2.start();
	    Thread th3=new Thread(t3);
	    th3.start();
	    obj.printNumber();
		}
}
