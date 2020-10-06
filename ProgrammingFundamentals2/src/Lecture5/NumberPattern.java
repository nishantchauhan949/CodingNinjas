package Lecture5;

import java.util.Scanner;
/*	55555				
	45555				        333
	34555  n =5			    233   n=3
	23455						123
	12345		
 */
public class NumberPattern {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i = 0; i < n; i++) {
			int someInt = n-i;
			for(int j = 0; j < n; j++) {
				System.out.print(someInt);
				if(someInt < n) {
					someInt++;
				}
			}
			System.out.println();
		}

	}

}
