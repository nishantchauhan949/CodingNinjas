package Lecture5;

import java.util.Scanner;
/*  1-4 = 0 zeroes
 *   5-9 = 1 zero
 *  10-14 = 2 zeroes
 *  15-19 = 3 zeroes
 *  20-24 = 4 zeroes
 *  25 - 29 = 6 zeroes
 *  30 - 34 = 7 zeroes      */
public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner s = new Scanner (System.in);
		long  n = s.nextLong();
		
		long zeroes = 0;
		
		
		for(long i =5; i <= n; i= i*5 ) {
			zeroes = zeroes + n/i;
		}
		System.out.println(zeroes);
		
	}

}
