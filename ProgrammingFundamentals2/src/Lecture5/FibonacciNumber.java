package Lecture5;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static boolean checkMember(int n){
		
		int last = 1;
		int secondLast = 0;
		int sum = 0;
		
		sum = secondLast + last;
		secondLast = last; 
		last = sum;
		
		for(int i = 1; i < n; i++) {
			sum = secondLast + last;
			secondLast = last; 
			last = sum;
			if(sum == n) {
				return true;
			} 
		}
		return false;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		checkMember(n);
		
		System.out.println(checkMember(n));
	}

}
