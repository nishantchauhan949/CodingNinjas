package twoDArrays;

import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		
		int [] [] arr = new int [M] [N];
		
		for(int i = 0; i <arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();
				sum = sum + arr[i][j];
			}
			System.out.print(sum + " ");
		}
		
	}

}
