package Lecture5;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void checkingPrime(int n) {

		for (int numberBeingChecked = 2; numberBeingChecked <= n; numberBeingChecked++) {


			if (numberBeingChecked == 2) {
				System.out.println(numberBeingChecked);
				continue;
			} 

			boolean b = false;

			for (int numberCheckingIt = 2; numberCheckingIt < numberBeingChecked; numberCheckingIt++) {
				if (numberBeingChecked % numberCheckingIt == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}

			if (b) {
				System.out.println(numberBeingChecked);
			}
			
		}

	}


	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		System.out.println("Enter N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		checkingPrime(n);

	}

}
