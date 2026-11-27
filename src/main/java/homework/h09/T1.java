package homework.h09;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/number-of-good-pairs/
public class T1 {

  public int numIdenticalPairs(int[] nums) {
    Map<Integer, Integer> frequencies = new HashMap<>();
    int goodPairsCount = 0;
    for (int value : nums) {
      int seenCount = frequencies.getOrDefault(value, 0);
      goodPairsCount += seenCount;
      frequencies.put(value, seenCount + 1);
    }
    return goodPairsCount;
  }
}
