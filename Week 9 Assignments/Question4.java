// A program needs to be developed which can mirror reflect any 5 × 5 2D character array into its side-by-side reflection. Write suitable code to achieve this transformation as shown below:

//        INPUT:                                       OUTPUT:
//               OOXOO                                        OOXOO
//               OOXOO                                        OOXOO
//               XXXOO                                        OOXXX
//               OOOOO                                        OOOOO
//               XOABC                                        CBAOX


import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char original[][]= new char[5][5];
		
		char reflection[][]= new char[5][5];
		
		for(int line=0;line<5; line++){
			String input = sc.nextLine();
			char seq[] = input.toCharArray();
			if(seq.length==5){
				for(int i=0;i<5;i++){
					original[line][i]=seq[i];
				}
			}
		}
		
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				reflection[i][j]=original[i][4-j];
			}
		}
		
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				System.out.print(reflection[i][j]);
			}
			System.out.println();
		}
	} 
} 
