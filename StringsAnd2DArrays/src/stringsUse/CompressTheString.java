package stringsUse;

import java.util.Scanner;

public class CompressTheString {
	
	public static String compress(String inputString) {
		String str = "";
		int i, j;
		for(i = 0; i < inputString.length(); i++) {
			int count = 1;
			str = str + inputString.charAt(i);
			for(j = i+1; j < inputString.length() - 1; j++) {
				if(inputString.charAt(i) == inputString.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			str = str + inputString.charAt(j) + count;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}

}
