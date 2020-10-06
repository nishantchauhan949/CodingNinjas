package Lecture4Patterns2;

import java.util.Scanner;
/*        1
         232		
       34543		n = 5
     4567654
   567898765   */


public class TriangleOfNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int space = 1; space <= n-i; space++) {
				System.out.print(" ");
			}
			int p = i;
			for(int j = 1; j <= i; j++) {
				System.out.print(p++);	
			}
			p=p-2;
			for(int j = 1; j < i; j++) {
				System.out.print(p--);
			}
			System.out.println();
			
		}
		
	}

}
