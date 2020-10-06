package recursion1;

import java.util.Scanner;

public class MultiplicationRecursive {

	public static int multiplyTwoIntegers(int m, int n){
		if(m == 0 || n == 0) {
			return 0;
		}
		if(m == 1) {
			return n;
		} else if(n==1) {
			return m;
		}
		int multi;
		if(m>=n) {
			n--;
			int returnedNumber = multiplyTwoIntegers(m, n);
			multi = returnedNumber + m;
			return multi;
		} else {
			m--;
			int returnedNumber = multiplyTwoIntegers(m, n);
			multi = returnedNumber + n;
			return multi;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}
}
