package Assignment;

import java.util.Scanner;

public class CheckNumberSequence {

	// 6
	// 8 7 6 5 8 2
	public static void main(String[] args) {
		System.out.println("how many numbers for the sequence?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Give the first number");
		int previous = s.nextInt();
		boolean isDecreasing = true;
		
		for(int i =1; i < n; i++ ) {
			System.out.println("Enter Current Number");
			int current = s.nextInt();
			
			if(current == previous) {
				isDecreasing = false;
				break;
			} else if(previous > current){
				isDecreasing = true;
			} else if(previous < current) {
				isDecreasing = true;
			}
			previous = current;
		}
		System.out.println(isDecreasing);
	}

}
