package Lecture5;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int last = 1;
		int secondLast = 0;
		int sum = 0;
				
		for (int i = 1; i < n ; i++) {
			
			sum = secondLast + last;
			secondLast = last; 
			last = sum;
			
		}
		
		System.out.println(sum);
		
	}

}
