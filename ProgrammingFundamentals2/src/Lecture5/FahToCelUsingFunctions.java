package Lecture5;
import java.util.Scanner;

public class FahToCelUsingFunctions {

	public static void fahrenheitToCelsius(int S, int E, int W) {
		int fah = 0, cel = 0;
		while (S <= E ) {

			fah = S;
			cel = ((fah-32)*5)/9;

			System.out.print(fah + "\t");
			System.out.println(cel);

			S = S + W;

		}
		//return cel;
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		//int fah = 0, cel;


		Scanner s = new Scanner(System.in);

		System.out.println("Enter Starting Point for Fahrenheit to Celsius");
		int S = s.nextInt();

		System.out.println("Enter End Point for Fahrenheit to Celsius");
		int E = s.nextInt();

		System.out.println("Enter Gap(W) for Fahrenheit to Celsius");
		int W = s.nextInt();
		
		fahrenheitToCelsius(S, E, W);

		//Celsius = ((Fahrenheit-32)*5)/9

//		while (S <= E ) {
//
//			fah = S;
//			cel = ((fah-32)*5)/9;
//
//			System.out.print(fah + "\t");
//			System.out.println(cel);
//
//			S = S + W;
//
//		}
	}

}
