package recursion1;

import java.util.Scanner;

public class CheckPalindromeRecursive {
	
	public static boolean palindromeHelper(String input, int startIndex, int endIndex) {
		if(input.length() <= 1) {
			return true;
		}
		if(startIndex > endIndex) {
			return true;
		}
		
		//boolean flag = palindromeHelper(input, startIndex +1, endIndex - 1);
		
		if(input.charAt(startIndex) == input.charAt(endIndex)) {
			return palindromeHelper(input, startIndex +1, endIndex - 1);
		} else {
			return false;
		}
	}
	
	public static boolean isStringPalindrome(String input) {
		return palindromeHelper(input, 0, input.length() -1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
}
