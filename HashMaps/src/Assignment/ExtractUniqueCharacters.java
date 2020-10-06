package Assignment;

import java.util.HashMap;

public class ExtractUniqueCharacters {
    public static String uniqueChar(String str){
        HashMap<Character, Integer> hm = new HashMap<>();

        String output = "";
        for (int i = 0; i < str.length(); i++){
            if (!hm.containsKey(str.charAt(i))){
                output = output + str.charAt(i);
                hm.put(str.charAt(i),0);
            }
        }

        return output;
    }
}
