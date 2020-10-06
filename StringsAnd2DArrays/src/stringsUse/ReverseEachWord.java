package stringsUse;

import java.util.Scanner;

public class ReverseEachWord {
	// string input = Coding ninjas the
	// string output = gnidoc sajnin eht

	public static String reverseEachWord(String input) { 
		String output = null;
		int start = 0;
	}

	//		public static String reverseEachWord(String input) {
	//			String ans, current;
	//			int start = 0;
	//			for(int i = 0; i < input.length(); i++) {
	//				if(input.charAt(i) == ' ') {
	//					int end = i;
	//					while(end>=start) {
	//						input  =  + input.substring(i, input.length());
	//						end--;
	//					}
	//				}
	//	
	//			}
	//		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseEachWord(input));
	}
}
