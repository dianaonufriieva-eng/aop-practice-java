package homework.h09;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class T2 {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int maxCandies = findMaxCandies(candies);
    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candyCount : candies) {
      result.add(candyCount + extraCandies >= maxCandies);
    }
    return result;
  }

  private int findMaxCandies(int[] candies) {
    int maxCandies = 0;
    for (int candyCount : candies) {
      if (candyCount > maxCandies) {
        maxCandies = candyCount;
      }
    }
    return maxCandies;
  }
}
