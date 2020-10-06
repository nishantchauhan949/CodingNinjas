package recursion2;

import java.util.Scanner;

public class CheckAB {

	/* a. The string begins with an 'a'
		b. Each 'a' is followed by nothing or an 'a' or "bb"
		c. Each "bb" is followed by nothing or an 'a'     */

	public static boolean checkABHelper(String input) {
		if(input.length() <= 0) {
			return false;
		}
		if(input.length() == 1 && input.charAt(0) == 'a') {
			return true;
		}
		boolean checker = false;
		if(input.charAt(0) == 'a') {
			checker = checkABHelper(input.substring(1)); 
		} else if(input.length() >= 2 ) {
			if(input.charAt(0) == 'b') {
				checker = checkABHelper(input.substring(2)); 
			}
		} else {
			return false;
		}

		if(checker) {
			if(input.charAt(0) == 'b' && input.charAt(1) == 'b') 
				checker  =true;
		} else {
			if(input.charAt(0) == 'b' && input.charAt(1) == 'b') 
				checker  =true;
		}
		return checker;
	}

	public static boolean checkAB(String input) {
		if(input.charAt(0) == 'b') {
			return false;
		}
		return checkABHelper(input);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}


}
