// Complete the code segment to check whether the number is an Armstrong number or not.

import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
      int temp = n;  
      int a = 0;
	  int c = 0;
      while(n>0){  
          a=n%10;  
          n=n/10;  
          c=c+(a*a*a);  
      }  
      if(temp==c)  
          result = 1;   
      else  
          result = 0; 
      System.out.println(result);   

 }
}
