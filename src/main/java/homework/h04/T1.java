package homework.h04;

// https://leetcode.com/problems/hamming-distance/description/

public class T1 {
  public int hammingDistance(int x, int y) {
    return Integer.bitCount(x ^ y);
  }
}
