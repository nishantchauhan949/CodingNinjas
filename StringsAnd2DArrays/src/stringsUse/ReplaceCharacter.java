package stringsUse;

import java.util.Scanner;

public class ReplaceCharacter {

	public static String replaceCharacter(String input, char c1, char c2) {
		for(int i = 0; i <input.length(); i++) {
			if(input.charAt(i) == c1) {
				input = input.substring(0, i) + c2 + input.substring(i+1);
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
	}

}
