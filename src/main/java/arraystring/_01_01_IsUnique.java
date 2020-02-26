package arraystring;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    // time o(n)
    // space o(1)
    boolean isUnique(String str) {
        if (str.length() > 126) {
            return false;
        } else if(str.length() < 1){
            return true;
        }
        int[] chars = new int[128];

        for (int i = 0; i < str.length(); i++) {
            chars[str.charAt(i)]++;
        }

        for (int i = 0; i < chars.length; i++){
            if (chars[i] > 1){
                return false;
            }
        }
        return true;
    }

}
