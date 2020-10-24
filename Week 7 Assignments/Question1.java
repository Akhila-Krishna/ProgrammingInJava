// Complete the following code fragment to read three integer values from the keyboard and find the sum of the values. 
// Declare a variable "sum" of type int and store the result in it.

import java.util.*;
public class Question1{ 
	  public static void main (String[] args){
		    int a,b,c,sum;
      	Scanner s = new Scanner(System.in);
      	a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        sum = a+b+c;
        System.out.println(sum);
    }
}
