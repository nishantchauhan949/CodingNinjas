package recursion1;

import java.util.Scanner;

public class CountZerosRecursive {

	public static int countZerosRec(int input){
		if(input > 0 && input <10) {
			return 0;
		}
		
		if(input == 0) {
			return 1;
		}
		int lastDigit = input % 10;
		int count = 0;
		if(lastDigit == 0) {
			count++;
		}
		input = input / 10;
		count = countZerosRec(input);
		
		if(lastDigit == 0) {
			count = count + 1;
		} 
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
		
		System.exit(0);
	}
}
