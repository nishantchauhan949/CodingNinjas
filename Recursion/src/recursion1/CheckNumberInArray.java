package recursion1;

import java.util.Scanner;

public class CheckNumberInArray {

	static Scanner s = new Scanner(System.in);

	public static boolean checkNumber(int input[], int x) {
		if(input.length == 0){
			return false;
		}
		if(input[0] == x){
			return true;
		} 

		int b[] = new int [input.length-1];
		for(int i = 1; i < input.length; i++) {
			b[i-1] = input[i];
		}
		boolean check = checkNumber(b, x);
		if(!check) {
			return false;
		} else {
			return true; 
		}
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}

}
