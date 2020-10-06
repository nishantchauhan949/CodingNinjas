package Assignment2;
import java.util.Scanner;

public class RootsQuadraticEquation {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		System.out.println("Enter a, b, c");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		double determinant = (b*b)-4*a*c;
		double x1, x2;
		int roundedRoot1, roundedRoot2;

		System.out.println("determinant = " + determinant);

		if(determinant>0) {
			x1 = (-b + Math.sqrt(determinant))/2*a;
			x2 = (-b - Math.sqrt(determinant))/2*a;

			roundedRoot1 = (int) Math.round(x1);
			roundedRoot2 = (int) Math.round(x2);

			System.out.println("1");
			System.out.println(roundedRoot1 + " " + roundedRoot2);

		} else if (determinant==0) {
			x1 = (-b + Math.sqrt(determinant))/2*a;
			x2 = (-b - Math.sqrt(determinant))/2*a;

			roundedRoot1 = (int) Math.round(x1);
			roundedRoot2 = (int) Math.round(x2);

			System.out.println("0");
			System.out.println(roundedRoot1 + " " + roundedRoot2);

		} else {
			System.out.println("-1");
		}

	}

}
