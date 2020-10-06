package Assignment2;
import java.util.Scanner;

public class AverageMarks {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char name = s.next().charAt(0);

		int firstTest = s.nextInt(), secondTest = s.nextInt(), thirdTest = s.nextInt(), average;
		
		//System.out.println(name);
		//System.out.println(firstTest + " " + secondTest + " " + thirdTest);
		
		if(firstTest >= secondTest && firstTest >= thirdTest) {
			if(secondTest >= thirdTest) {
				average = (firstTest+secondTest)/2;
			} else {
				average = (firstTest+thirdTest)/2;
			}
			
		} else if (secondTest >= thirdTest) {
			average = (firstTest+secondTest)/2; 
		
		} else if (firstTest>=secondTest) {
			average = (thirdTest + firstTest)/2;
		
		} else {
			average = (thirdTest + secondTest)/2;
		}
		
		System.out.println(name + " " + average);
		
		
	}

}
