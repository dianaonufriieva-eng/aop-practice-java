package homework.h02;

// https://leetcode.com/problems/a-number-after-a-double-reversal/

public class T2 {
  public static boolean isSameAfterReversals(int number) {
    return number == 0 || number % 10 != 0;
  }
}
