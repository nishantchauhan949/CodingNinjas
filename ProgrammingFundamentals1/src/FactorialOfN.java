import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long product = 1;
		for(long i = 1; i <= n; i++) {
			product = product * i;
		}
		System.out.println(product);
	}

}
