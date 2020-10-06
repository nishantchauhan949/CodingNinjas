package Assignment2;
import java.lang.Math;
import java.util.Scanner;
public class powerOfNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		
		int answer = (int) Math.pow(x, n);
		
		System.out.println(answer);
	}

}