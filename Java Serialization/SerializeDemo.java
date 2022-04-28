import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Ramu";
      e.address = "Hyderabad";
      e.sal = 50000;
      e.number = 101;

	   Employee e1 = new Employee();
      e1.name = "ramesh";
      e1.address = "pune";
      e1.sal = 60000;
      e1.number = 102;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.writeObject(e1);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}