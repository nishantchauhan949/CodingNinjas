package Assignment;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner s = new Scanner (System.in);
		long  n = s.nextLong();
		long ans = 0, remainder = 0;
		long placeValue = 1;
		
		for(long i = 0; i < n ; i++,i--) {
			
			remainder = n % 2;
			ans = (remainder * placeValue) + ans;
			placeValue *= 10; 
			n = n/2;
		}
		
		System.out.println(ans);
	}

}
