package stringsUse;

import java.util.Scanner;

public class CountWords {

	static Scanner s = new Scanner(System.in);
	
	public static int countWords(String str) {
		int spaceCount = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		return spaceCount + 1;
	}
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(countWords(str));
	}


}
