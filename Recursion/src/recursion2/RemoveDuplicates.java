package recursion2;

import java.util.Scanner;

public class RemoveDuplicates {

	static Scanner s = new Scanner(System.in);

	public static String removeConsecutiveDuplicatesHelper(String s) {
		if(s.length() == 1) {
			String str = "";
			str = str + s.charAt(0);
			return str;
		}
		
		String smallOutput = removeConsecutiveDuplicatesHelper(s.substring(0, s.length() - 1));
		if(s.charAt(s.length() - 2) != s.charAt(s.length() - 1)) {
			smallOutput = smallOutput + s.charAt(s.length() - 1);
		}
		return smallOutput;
	}

	public static String removeConsecutiveDuplicates(String s) {
		String str = removeConsecutiveDuplicatesHelper(s);
		return str;
	}

	public static void main(String[] args) {
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}

}
