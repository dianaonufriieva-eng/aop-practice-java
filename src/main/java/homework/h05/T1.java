package homework.h05;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

public class T1 {
  public static int maxProductDifference(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int value : nums) {
      if (value > largest) {
        secondLargest = largest;
        largest = value;
      } else if (value > secondLargest) {
        secondLargest = value;
      }

      if (value < smallest) {
        secondSmallest = smallest;
        smallest = value;
      } else if (value < secondSmallest) {
        secondSmallest = value;
      }
    }

    return (largest * secondLargest) - (smallest * secondSmallest);
  }
}
