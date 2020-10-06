package stringsUse;

import java.util.Scanner;

public class CheckPalindrome {
	public static boolean checkPalindrome(String str){
		//System.out.println(str.length());
		int j = str.length() - 1;
		for(int i = 0; i < j; i++) {

			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			j--;

		}
		return true;

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(checkPalindrome(str));
	}

}
