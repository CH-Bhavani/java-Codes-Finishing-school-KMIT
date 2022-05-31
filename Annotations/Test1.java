
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
 
import java.lang.reflect.*;  
// User-defined annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation
{
    String Developer() default "Rahul";
    String Expirydate();
} // will be retained at runtime
 
// Driver class that uses @TestAnnotation
 class TestAnn
{
    @TestAnnotation(Developer="Rahul", Expirydate="01-10-2020")
    public void fun1Imp()
    {
        System.out.println("Test method 1");
    }

    
 
    @TestAnnotation(Developer="Anil", Expirydate="01-10-2021")
    public void fun2Imp()
    {
        System.out.println("Test method 2");
    }
	}

     public class Test1
     {
         public static void main(String args[])throws Exception
    {
        TestAnn h=new TestAnn();  

        
        Method m=h.getClass().getMethod("fun3Imp");  
      
    TestAnnotation manno=m.getAnnotation(TestAnnotation.class);  
      System.out.println("value is: "+manno.Developer());  
    }
}