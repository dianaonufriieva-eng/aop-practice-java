package homework.h04;

// https://leetcode.com/problems/hamming-distance/
public class T1 {
  public static int hammingDistance(int x, int y) {
    return Integer.bitCount(x ^ y);
  }
}
