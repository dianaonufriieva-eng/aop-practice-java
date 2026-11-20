package homework.h02;

// https://leetcode.com/problems/add-digits/

public class T1 {
  public static int addDigits(int number) {
    if (number == 0) {
      return 0;
    }

    return 1 + (number - 1) % 9;
  }
}
