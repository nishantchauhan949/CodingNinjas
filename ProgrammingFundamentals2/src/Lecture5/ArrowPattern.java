package Lecture5;

import java.util.Scanner;

public class ArrowPattern {
/*		*
 		 **
   		  * * *
   		   * * * *       n=7
   		  * * *
   		 * *
   		*
 * 
 */
	public static void main(String[] args) {
		
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n1 =t/2+1;
		
		for(int rows = 1; rows <=n1; rows++) {
			for(int space = 1; space < rows; space++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= rows; columns++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int n2 =t/2; 
		
		for(int i =1; i <=n2; i++) {
			for(int space = i; space <n2; space++) {
				System.out.print(" ");
			}
			for(int j=1; j<= n2-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
