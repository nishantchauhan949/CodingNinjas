package Assignment;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean bracketReturn(char bracket1, char bracket2){
        if (bracket1 == '(' && bracket2 == ')'){
            return true;
        } else if (bracket1 == '{' && bracket2 == '}'){
            return true;
        } else if (bracket1 == '[' && bracket2 == ']'){
            return true;
        }
        return false;
    }

    public static boolean checkBalanced(String exp) {
        Stack<Character> st1 = new Stack<>();
        boolean flag = false;


        for (int i = 0; i < exp.length(); i++){
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
                st1.push(exp.charAt(i));
                continue;
            }

            if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
                if (st1.isEmpty()){
                    return false;
                }
                if (bracketReturn(st1.pop(), exp.charAt(i))){
                    flag = true;
                } else {
                    return false;
                }
            }
        }

        if (st1.isEmpty()){
            return flag;
        } else {
            return false;
        }
    }

}
