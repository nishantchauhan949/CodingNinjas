package recursion1;

import java.util.Scanner;

public class SumOfDigitsRecursive {

	public static int sumOfDigits(int input){
		if(input > 0 && input <10) {
			return input;
		}
		if(input == 0) {
			return 0;
		}
		int lastDigit = input % 10;
		int sum = lastDigit;
		input = input/10;
		sum = sum + sumOfDigits(input);
		return sum;
	}

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}
}
