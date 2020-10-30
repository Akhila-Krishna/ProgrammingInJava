// Write a program which will print a pyramid of "numbers" 's of height "n" and print the sum of all number's in the pyramid.

import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
		int n = inr.nextInt();
        
      	int k = 0, sum=0;
        for(int i = 1; i <= n; i++, k=0) {
            for(int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            int num = 1;
            while(k != 2 * i - 1) {
                System.out.print(num + " ");
                sum = sum+num;
              	num++;
                k++;
            }
            System.out.println();
        }
        System.out.println(sum); 
    }
}
