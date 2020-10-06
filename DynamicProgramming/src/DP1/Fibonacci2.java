package DP1;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] solution = new int[n+1];
        solution[1] = 1;
        for (int i = 2; i < solution.length; i++){
            solution[i] = solution[i-1] + solution[i-2];
        }
        System.out.println(solution[n]);

    }
}
