package arraystring;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation {
    boolean check(String a, String b) {
        int[] chars = new int[128];
        for (int i = 0; i < a.length(); i++){
            chars[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++){
            chars[b.charAt(i)]--;
        }

        for (int i = 0; i < chars.length; i++){
            if (chars[i] != 0){
                return false;
            }
        }
        return true;
    }
}
