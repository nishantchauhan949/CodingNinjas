package Lecture4Patterns2;

import java.util.Scanner;

public class MirrorNumberPattern {
	/*       1
    		12		n=4
  		  123
		1234 */


	public static void main(String[] args) {

		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i = 1; i <=n; i++) {
			for(int space = 1; space <= n-i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
