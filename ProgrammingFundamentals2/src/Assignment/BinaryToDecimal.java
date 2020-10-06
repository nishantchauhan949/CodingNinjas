package Assignment;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner s = new Scanner (System.in);
		long  n = s.nextLong();
		
		long ans = 0, remainder = 0;
		long placeValue = 1;
		
		for(long i = 0; i < n ; i++,i--) {
			remainder = n % 10;
			ans = ans + (remainder  * placeValue);
			placeValue *= 2;
			n = n/10;
		}
		System.out.print(ans);
		
	}

}
