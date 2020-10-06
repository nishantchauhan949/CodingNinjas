package DP1;

public class MinStepsToOne {
    public static int countStepsTo1(int n){
        if (n == 1){
            return 0;
        }

        if (n % 3 == 0){
            return countStepsTo1(n/3) + 1;
        } else if (n % 2 == 0){
            return countStepsTo1(n/2) + 1;
        } else {
            return countStepsTo1(n-1) + 1;
        }
    }
}
