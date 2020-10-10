// This program is related to the generation of Fibonacci numbers.
// For example: 0, 1, 1, 2, 3, 5, 8, 13,… is a Fibonacci sequence where 13 is the 8thFibonacci number. 
// A partial code is given and you have to complete the code as per the instruction given as comments.

import java.util.Scanner; 
public class Fibonacci { 
   public static void main(String args[]) { 
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt(); 
            System.out.println(fib(n)); 
        } 
        static int fib(int n) {

      if(n==1 | n==2){
        return n-1;
      }
      else {
        return fib(n-1)+fib(n-2);
      }
   } 
}
