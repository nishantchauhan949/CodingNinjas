package Lecture3Patterns1;

import java.util.Scanner;

public class InterestingAlphabets {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        
        int row = 1;
        
        while(row<=n){
        	char someChar = (char)('A'+(n-row));
            int column = 1;
            
            while(column<=row){
                
                System.out.print((char)(someChar));
                someChar = (char) (someChar + 1);
                column++;
            }
            System.out.println();
            row++;
        }
		
	}

}
