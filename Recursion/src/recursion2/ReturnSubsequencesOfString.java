package recursion2;

import java.util.Scanner;

public class ReturnSubsequencesOfString {

	public static String[] subsequence(String input) {
		if(input.length() == 0) {
			String [] strArr = {""};
			return strArr;
		}
		String [] smallOutput = subsequence(input.substring(1));
		String output[] = new String[smallOutput.length * 2];
		//int i = 0;
		for(int i = 0; i < smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}
		for(int i = 0; i < smallOutput.length; i++) {
			output[i + smallOutput.length] = input.charAt(0) + smallOutput[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = subsequence(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
