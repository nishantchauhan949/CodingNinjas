package Lecture2;
import java.util.Scanner;

public class FahrenheitToCelsius {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		int fah = 0, cel;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Starting Point for Fahrenheit to Celsius");
		int S = s.nextInt();
		
		System.out.println("Enter End Point for Fahrenheit to Celsius");
		int E = s.nextInt();
		
		System.out.println("Enter Gap(W) for Fahrenheit to Celsius");
		int W = s.nextInt();
		
		//Celsius = ((Fahrenheit-32)*5)/9
		
		while (S <= E ) {
			
			fah = S;
			cel = ((fah-32)*5)/9;
			
			System.out.print(fah + "\t");
			System.out.println(cel);
			
			S = S + W;
			
		}
	}

}
