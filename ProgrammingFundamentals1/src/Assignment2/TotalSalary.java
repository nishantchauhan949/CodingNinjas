package Assignment2;
import java.util.Scanner;

public class TotalSalary {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int basicSalary = s.nextInt(); 
		char grade = s.next().charAt(0);
		int allow;
		double hra, da, pf, totalSalary;

		hra = basicSalary * 0.2;
		da = basicSalary * 0.5;
		pf = basicSalary * 0.11;

		if(grade == 'A') {
			allow = 1700;
			
		} else if (grade == 'B') {
			allow = 1500;
		
		} else {
			allow = 1300;
		}
		
		totalSalary = basicSalary + hra + da + allow - pf;
		int totalSalaryInt = (int) Math.round(totalSalary);
		System.out.println(totalSalaryInt);

	}

}
