package arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength) {
        if (chars.length < trueLength){
            throw new IllegalArgumentException("Too long");
        }

        int spaces = countSpace(chars, trueLength);
        for (int i = trueLength - 1; i >= 0; i--) {
            if (chars[i] == ' '){
                spaces--;
                chars[i + (spaces * 3) + 2 - spaces] = '0';
                chars[i + (spaces * 3) + 1 - spaces] = '2';
                chars[i + (spaces * 3) + 0 - spaces] = '%';
            } else {
                chars[i+ (spaces * 3) - spaces] = chars[i];
            }
        }
    return chars;
    }

    private int countSpace(char[] chars, int length){
        int count = 0;
        for (int i = 0; i < length; i++){
            if (chars[i] == ' '){
                count++;
            }
        }
        return count;
    }
}
