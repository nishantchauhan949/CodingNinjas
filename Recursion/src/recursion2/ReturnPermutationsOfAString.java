package recursion2;

import java.util.Scanner;

public class ReturnPermutationsOfAString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public static String[] permutationOfString(String input){
		if(input.length() == 0) {
			String output[] = {""};
			return output;
		}
		String[] smallOutput = permutationOfString(input.substring(1));
		String [] output = new String[smallOutput.length * input.length()];
		int k = 0;
		for(int i = 0; i < smallOutput.length; i++) {
			int p = 0;
			int j = smallOutput[i].length() ;
			while(k < output.length && p <= j) {
				output[k] = smallOutput[i].substring(0, p) + input.charAt(0) + smallOutput[i].substring(p, j) ;
				k++;
				p++;
			}
		}
		return output;
	}

}
