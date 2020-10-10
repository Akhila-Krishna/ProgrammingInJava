// Complete the code segment to find the highest mark and average mark secured by Hari in "s" number of subjects.

import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double mark_avg;
            int result;
            int i;
            int s;
            s = input.nextInt();
            int[] arr = new int[s];   
            for(i=0;i<arr.length;i++) {
        	      arr[i]=input.nextInt();
	          } 
            int sum = 0;
            int max = 0;
            for(i=0; i<s; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
                sum = sum + arr[i];
            }
    double average = sum/s;
    System.out.println(max);
    System.out.println(average);
    }
}
