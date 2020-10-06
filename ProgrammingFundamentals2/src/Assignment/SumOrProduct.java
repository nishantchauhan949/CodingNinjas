package Assignment;

import java.util.Scanner;

public class SumOrProduct {
	
	public static long sum(int n) {
		long sum = 0;
		for(int i = 1; i <=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static long product(int n) {
		long product = 1;
		for(int i = 1; i <=n; i++) {
			product = product * i;
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = s.nextInt();
		
		System.out.println("Enter Choice(C)");
		int c = s.nextInt();
		
		if(c == 1 ) {
			System.out.println(sum(n));
		} else if (c == 2) {
			System.out.println(product(n));
		} else {
			System.out.println("-1");
		}
		
	}

}
