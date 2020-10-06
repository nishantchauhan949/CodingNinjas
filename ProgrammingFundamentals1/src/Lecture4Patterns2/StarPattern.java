package Lecture4Patterns2;

import java.util.Scanner;
	/*	*
	   *** 		n=4;
      *****
     ******* */
public class StarPattern {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int space = 1; space <= n-i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
