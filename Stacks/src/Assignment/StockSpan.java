package Assignment;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        Stack<Integer> stockStack = new Stack<>();
        int[] spanArr = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            spanArr[i] = counter(stockStack, price[i]);
            stockStack.push(price[i]);
        }

        return spanArr;
    }

    public static int counter(Stack<Integer> stock,int ithDayPrice) {
        if (stock.isEmpty()){
            return 1;
        }
        int count = 1;
        ArrayList<Integer> poppedArr = new ArrayList<>();
        int j = 0;
        while (!stock.isEmpty()){
            poppedArr.add(j,stock.pop());
            if (poppedArr.get(j) < ithDayPrice){
                count++;
            } else {
                break;
            }
            j++;
        }

        j = poppedArr.size() - 1;
        while (j >= 0){
            stock.push(poppedArr.get(j));
            j--;
        }

        return count;
    }
}
