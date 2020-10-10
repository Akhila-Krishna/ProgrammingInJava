// Complete the code segment to catch the ArithmeticException in the following, if any. On the occurrence of such an exception, your program should print 
// “Exception caught: Division by zero.” If there is no such exception, it will print the result of division operation on two integer values.

import java.util.Scanner;

public class Question5_3 {
  public static void main(String[] args) { 
      int a, b;
      Scanner input = new Scanner(System.in);
      //Read any two values for a and b.
      //Get the result of a/b;
      a = input.nextInt();
      b = input.nextInt();
      try{
          System.out.print(a/b);
      }
      catch(ArithmeticException e){
          System.out.print("Exception caught: Division by zero.");
      }
   }
}
