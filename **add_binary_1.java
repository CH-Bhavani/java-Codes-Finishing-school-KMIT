/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

*/






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
