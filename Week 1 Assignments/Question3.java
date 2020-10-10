// Consider first n even numbers starting from zero(0).Complete the code segment to calculate sum of  all these numbers divisible by 3 . Print the sum.

import java.util.Scanner;
public class Exercise1_3 {
  public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
        for(int i=0; i<n; i=i+1){
          int j = i*2;
          if(j%3 == 0){
            sum = sum + j;
          }
        }
        System.out.println(sum);
  }
}
