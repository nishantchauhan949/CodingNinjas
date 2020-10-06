package Assignment;

import java.util.Scanner;

public class Runner {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
//        String input = s.nextLine();
//        System.out.println(BalancedParenthesis.checkBalanced(input));
//        System.out.println(CheckRedundantBrackets.checkRedundantBrackets(input));

        int n = s.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }

        int[] output = StockSpan.stockSpan(input);
        for (int i = 0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}
