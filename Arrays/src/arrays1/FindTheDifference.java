package arrays1;

import java.util.Scanner;

public class FindTheDifference {
	
	public static int findDifference(int[] input){
		int sumAtOdd =0,  sumAtEven = 0;
		
		for(int i = 0; i < input.length; i++) {
			if (i == 0 || i % 2 == 0) {
				sumAtEven = sumAtEven + input[i];
			} else {
				sumAtOdd = sumAtOdd + input[i];
			}
		}
		return sumAtEven - sumAtOdd;
	}
	
	public static void main(String[] args) {
		System.out.println("How many integers in the array?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int [] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int difference = findDifference(arr);
		System.out.println(difference);
	}

}
