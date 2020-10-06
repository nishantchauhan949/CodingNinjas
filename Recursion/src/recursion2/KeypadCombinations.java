package recursion2;

import java.util.Scanner;

public class KeypadCombinations {

	public static String[] getString(int i) {
		if (i == 2) {
			String [] output = {"a","b","c"};
			return output;
		}
		if (i == 3) {
			String [] output = {"d","e","f"};
			return output;
		}
		if (i == 4) {
			String [] output = {"g","h","i"};
			return output;
		}
		if (i == 5) {
			String [] output = {"j","k","l"};
			return output;
		}
		if (i == 6) {
			String [] output = {"m","n","o"};
			return output;
		}
		if (i == 7) {
			String [] output = {"p","q","r","s"};
			return output;
		}
		if (i == 8) {
			String [] output = {"t","u","v"};
			return output;
		}
		if (i == 9) {
			String [] output = {"w","x","y","z"};
			return output;
		}
		String[] output = {""};
		return output;
	}

	public static String[] keypad(int n){
		if(n <= 1) {
			String[] output = {""};
			return output;
		}
		if(n > 1 && n < 10) {
			String [] output = getString(n);
			return output;
		}
		String [] smallOutput = keypad(n/10);
		
		String output[] = new String[getString(n%10).length * smallOutput.length];
		int j = 0;
		for(int i = 0; i < smallOutput.length; i++) {
			String [] temp = getString(n%10);
			
			for(int k = 0; j < output.length && k < temp.length; j++, k++) {
				output[j] = smallOutput[i] + temp[k]; 
			}
			
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
