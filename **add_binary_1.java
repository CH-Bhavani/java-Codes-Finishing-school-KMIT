/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

*/




/////////////////sol:1//////////

public class AddBinaryNumbersWay2 {

 public static void main(String[] args) {

  // two binary numbers in string format
  String binaryNumber1 = "10101", binaryNumber2 = "10001";

  // converting strings into binary format numbers 
  Integer integer1 = Integer.parseInt(binaryNumber1, 2);
  Integer integer2 = Integer.parseInt(binaryNumber2, 2);

  // adding two integers
  Integer output = integer1 + integer2;
  
  // converting final output back to Binary Integer
  System.out.println(Integer.toBinaryString(output));

 }

}




////////////sol:2//////////////////////



import java.math.BigInteger;
class Solution {
    public  String addBinary(String a, String b) {
        BigInteger one = new BigInteger(a, 2);
        BigInteger two = new BigInteger(b, 2);
        BigInteger sum = one.add(two);
        return sum.toString(2);
    }
}






/////////////////////////sol:3/////////////////////





class Solution {
    public String addBinary(String a, String b) {
        int carry =0,sum=0;
        StringBuilder sb=new StringBuilder();
        int alen=a.length()-1,blen=b.length()-1;
        while(alen>=0 || blen>=0){
            if (alen>=0)
                sum+=(a.charAt(alen--)-'0');
            if (blen>=0)
                sum+=(b.charAt(blen--)-'0');
            sum=sum+carry;
            sb.append(sum%2);
            carry=sum/2;
            sum=0;
        }
        if(carry==1)
            sb.append(carry);
        return sb.reverse().toString(); 
    }
}
