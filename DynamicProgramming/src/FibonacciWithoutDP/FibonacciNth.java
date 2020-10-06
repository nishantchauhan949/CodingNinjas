package FibonacciWithoutDP;

import java.util.Scanner;

public class FibonacciNth {
    private static int nthFibonacciNumber(int n){
        if (n <= 1){
            return n;
        }
        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(nthFibonacciNumber(n));
    }
}
