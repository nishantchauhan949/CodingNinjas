package Assignment2;
import java.util.Scanner;

public class SumOfEvenAndOdd {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		System.out.println("Enter n");
		
		Scanner s = new Scanner(System.in);
		int n, sumOfEven = 0, sumOfOdd = 0, remainder;
		n = s.nextInt();
		
		for(int i=n; i<=n; i=i/10) {
			remainder = n % 10;
			if((remainder % 2) == 0) {
				sumOfEven = sumOfEven + remainder;
			} else {
				sumOfOdd = sumOfOdd + remainder;
			}
			
			n = n/10;
			if(n==0) {
				break;
			}
		}
		System.out.println("Sum of Even : "+sumOfEven);
		System.out.println("Sum of Odd : "+sumOfOdd);
	}

}
