package Lecture2;
import java.util.Scanner;

public class CharacterCase {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		System.out.println("Enter your Character");
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		
		System.out.println("Your character is = "+a);
		//		int b = s.nextInt();
		//		int c = s.nextInt();

		if(a>=97 && a<=122) {
			
			System.out.println("0");
			
		} else if(a>=65 && a<=90) {
			
			System.out.println("1");
			
		} else {
			System.out.println("-1");
		}

	}

}
