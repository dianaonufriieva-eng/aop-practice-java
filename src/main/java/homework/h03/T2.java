package homework.h03;

// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/

public class T2 {
  public static int differenceOfSums(int limit, int divisor) {
    int nonDivisibleSum = 0;
    int divisibleSum = 0;

    for (int value = 1; value <= limit; value++) {
      if (value % divisor == 0) {
        divisibleSum += value;
      } else {
        nonDivisibleSum += value;
      }
    }

    return nonDivisibleSum - divisibleSum;
  }
}
