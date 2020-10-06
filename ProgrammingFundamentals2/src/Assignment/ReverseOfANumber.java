package Assignment;

import java.util.Scanner;

public class ReverseOfANumber {
	// 1980 -> 891
	// 226590000 -> 95622
	// 123456789 -> 987654321
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner (System.in);
		long  n = s.nextLong();
		long reverseNumber = 0, currentNumber=0;
		
		for(int i = 0; i < n ; i++,i--) {
			currentNumber = n % 10;
			reverseNumber = (reverseNumber * 10) + currentNumber;
			n=n/10;
		}
		System.out.print(reverseNumber);
	}

}
