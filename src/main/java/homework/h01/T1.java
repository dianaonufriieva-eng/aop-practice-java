package homework.h01;

// https://leetcode.com/problems/smallest-even-multiple/

public class T1 {
  public static int smallestEvenMultiple(int number) {
    return number % 2 == 0 ? number : number * 2;
  }
}
