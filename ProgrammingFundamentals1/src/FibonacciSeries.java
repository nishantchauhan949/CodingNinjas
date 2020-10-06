import java.util.Scanner;

public class FibonacciSeries {
	
	//  0th 1st 2nd 3rd 4th 5th 6th 7th 8th 9th 10th....n
	//   0		 1 	   1 	 2    3     5    8   13   21   34    55.....n
	// Print Fibonacci Sequence till N
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int last = 1;
		int secondLast = 0;
		int sum = 0;
		
		System.out.print(secondLast + " " + last);
		
		for (int i = 2; i < n ; i++) {
			
			sum = secondLast + last;
			System.out.print (" " + sum + " ");
			secondLast = last; 
			last = sum;
			
		}
		
	}

}
