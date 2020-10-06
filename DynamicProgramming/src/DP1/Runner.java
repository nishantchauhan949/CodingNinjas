package DP1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(MinStepsToOne.countStepsTo1(n));
    }
}
