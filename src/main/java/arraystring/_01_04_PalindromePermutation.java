package arraystring;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */
class _01_04_PalindromePermutation {
    boolean check(String s) {
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (int i= 0; i <s.length(); i++) {
            if (s.charAt(i) != ' ') {
                set.add(s.charAt(i));
            }
        }
        boolean found = false;
        for (int i = 0; i < s.length(); i++){

        }

    }
}
