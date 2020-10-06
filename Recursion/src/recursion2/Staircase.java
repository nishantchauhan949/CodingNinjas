package recursion2;

import java.util.Scanner;

public class Staircase {
	
	public static int findWays(int n){
		if (n == 1 || n == 0)  
            return 1; 
        else if (n == 2)  
            return 2; 
        else
            return findWays(n - 3) +   findWays(n - 2) + findWays(n - 1);     
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(findWays(n));
	}

}
