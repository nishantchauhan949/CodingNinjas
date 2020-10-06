package Lecture4Patterns2;

import java.util.Scanner;

public class DiamondOfStars {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        int n1 = t/2 + 1;
        
        for(int i=1;i<=n1;i++) {
        	for(int space=1;space<=n1-i;space++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*i-1;j++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();	
        }
        int n2 =t/2;
        for(int i = 1; i<= n2; i++) {
        	for(int space = 1; space <= i; space++) {
        		System.out.print(" ");
        	}
        	for(int j=1; j<=t-2*i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
	}

}
