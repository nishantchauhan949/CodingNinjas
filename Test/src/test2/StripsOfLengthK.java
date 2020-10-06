package test2;

import java.util.Scanner;

public class StripsOfLengthK {

	public static String[] allStrings(String charSet, int len){
		if(len == 0) {
			String output[] = {""};
			return output;
		}
		String smallOutput[] = allStrings(charSet, len-1);
		String output[] = new String[smallOutput.length * charSet.length()];
		int k = 0;
		for(int i = 0; i < smallOutput.length; i++) {
			for(int  j = 0; j < charSet.length(); j++) {
				output[k] = charSet.charAt(j) + smallOutput[i];
				k++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String charSet = s.next();
		int len = s.nextInt();
		String ans[] = allStrings(charSet, len);
		for(String str : ans){
			System.out.println(str);
		}
	}

}
