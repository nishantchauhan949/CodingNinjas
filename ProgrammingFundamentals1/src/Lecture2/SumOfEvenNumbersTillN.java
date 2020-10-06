package Lecture2;
import java.util.Scanner;

public class SumOfEvenNumbersTillN {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		System.out.println("Enter N");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		while(i<=n) {

			sum = sum + i;
			i += 2;

		}

		System.out.println("Sum of Even Numbers Till N\n" +sum);
	}

}
