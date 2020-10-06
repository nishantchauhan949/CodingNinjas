package Lecture4Patterns2;

import java.util.Scanner;

public class InvertedNumberPattern {
	/*	4444
		333 		n=4
		22
		1  */
	public static void main(String[] args) {
		
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n-i; j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}
	
	}

}
