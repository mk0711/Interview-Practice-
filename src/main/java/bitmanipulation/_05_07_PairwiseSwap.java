package bitmanipulation;

/**
 * Write a program to swap odd and even bits in an integer with as few instructions as
 * possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
 */
class _05_07_PairwiseSwap {
    int swap(int n) {
        return ((0xaaaa_aaaa & n) >>> 1) | ((0x5555_5555 & n) << 1);
    }
}
