/*


Given two dates print the number of  days between those given dates

input date format is  YYYY-MM-DD Format 

input = 2000-05-01
2020-01-01
output= 7184

input=2000-01-01
2000-12-31
output=365


*/


import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
public class test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String date1=sc.next();
        String date2=sc.next();
        //DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate start=LocalDate.parse(date1);
        LocalDate end=LocalDate.parse(date2);
        System.out.println(ChronoUnit.DAYS.between(start,end));
    }
}
