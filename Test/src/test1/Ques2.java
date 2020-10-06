package test1;

import java.util.Scanner;

public class Ques2 {
	/* 1234554321
	1234**4321
	123****321		n=5
	12******21
	1********1    */

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i = 1; i <= n; i++) {

			for(int j = n; j >0; j--) {
				if(j>=i) {
					System.out.print((n+1)-j); 
				} else {
					System.out.print("*");
				}
			}
			for(int j = 1; j<=n; j++) {
				if(j<i) {
					System.out.print("*"); 
				} else {
					System.out.print(n-j+1);
				}
			}
			System.out.println();
		}

	}

}
