import java.util.Scanner;

public class PalindromeSubstrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int count = PalindromeSubstrings.countPalindromeSubstrings(input);
        System.out.println(count);
    }

//    public static String reverseString(String halfString){
//        if (halfString.length() == 1){
//            return halfString;
//        }
//        if (halfString.length() == 0){
//            return "";
//        }
//        String smallReverseStr = reverseString(halfString.substring(1,halfString.length() - 1));
//        String reversedStr = halfString.charAt(halfString.length()-1) + smallReverseStr + halfString.charAt(0);
//        return reversedStr;
//    }

    public static int countPalindromeSubstrings(String s) {
        int mid1 = 0;
        int count = s.length();

        while (mid1 < s.length()){
            int left = mid1-1;
            int right = mid1 + 1;
            while (left >= 0 && right < s.length()){
                if (s.charAt(left) == s.charAt(right)){
                    count++;
                    left--;
                    right++;
                }else {
                    break;
                }
            }
            mid1++;
        }
        
        mid1 = 0;
        int mid2 = mid1+1;

        while (mid2 < s.length()){
            if (s.charAt(mid1) != s.charAt(mid2)){
            } else {
                count++;
                int left = mid1-1;
                int right = mid2 + 1;
                while (left >= 0 && right < s.length()){
                    if (s.charAt(left) == s.charAt(right)){
                        count++;
                        left--;
                        right++;
                    }else {
                        break;
                    }
                }
            }
            mid1++;
            mid2 = mid1 + 1;
        }

        return count;
    }
}
