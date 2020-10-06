package Assignment;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner s = new Scanner (System.in);
		int  n = s.nextInt();
		
		System.out.println((int)(Math.sqrt(n)));
	}

}
