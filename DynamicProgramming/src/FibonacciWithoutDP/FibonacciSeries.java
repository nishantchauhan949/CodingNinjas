package FibonacciWithoutDP;

import java.util.Scanner;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;

    private static void fibonacciSeries(int n){
        if (n > 0){
            n3 = n1 + n2;
            n1  = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacciSeries(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(n1 + " " + n2);
        fibonacciSeries(n-2);
    }
}
