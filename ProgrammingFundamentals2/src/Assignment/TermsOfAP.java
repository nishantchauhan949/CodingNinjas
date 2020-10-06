package Assignment;

import java.util.Scanner;

public class TermsOfAP {
	
	// 5 11 14 17 23 26 29 35 38 41    <- x=10
	// 3N+2, where N = 1,2,3,4,5....
	// multiples of 4 should not be printed
	
	public static void main(String[] args) {
		System.out.println("Enter X");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int term;
		for(int i = 1; i <= x; i++) {
			term = 3*i+2;
			if(term % 4 == 0) {
				x++;
				continue;
			}
			System.out.print(term + " ");
		}
		
	}

}
