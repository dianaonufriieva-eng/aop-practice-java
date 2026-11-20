package homework.h04;

// https://leetcode.com/problems/number-complement/

public class T2 {
  public static int findComplement(int number) {
    int mask = (Integer.highestOneBit(number) << 1) - 1;

    return ~number & mask;
  }
}
