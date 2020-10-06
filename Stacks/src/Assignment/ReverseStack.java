package Assignment;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        recursionCopy(s1, s2);
    }

    public static void recursionCopy(Stack<Integer> s1, Stack<Integer> s2){
        if (s2.isEmpty()){
            return;
        }

        int temp = s2.pop();
        recursionCopy(s1, s2);
        s1.push(temp);
    }
}
