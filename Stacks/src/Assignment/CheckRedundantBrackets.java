package Assignment;

import java.util.Stack;

public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String str) {

        Stack<Character> characterStack = new Stack<>();

        boolean flag = false;
        for (int i = 0; i < str.length(); i++){
            int count = 0;
            if (str.charAt(i) != ')'){
                characterStack.push(str.charAt(i));
            }else {
                boolean leftBracketOcuured = false;
                while (!leftBracketOcuured){
                    if (characterStack.peek() == '('){
                        leftBracketOcuured = true;
                    }else {
                        characterStack.pop();
                        count++;
                    }
                }

                if (count == 0){
                    characterStack.pop();
                    flag = true;
                } else {
                    characterStack.pop();
                }
            }
        }

        return flag;
    }
}
