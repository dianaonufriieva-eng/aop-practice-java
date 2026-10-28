package homework.h05;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/

public class T1 {

  public static void main(String[] args) {
    int[] nums1 = {5, 6, 2, 7, 4};
    System.out.println("Результат 1: " + maxProductDifference(nums1));

    int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
    System.out.println("Результат 2: " + maxProductDifference(nums2));
  }

  public static int maxProductDifference(int[] nums) {
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;

    for (int num : nums) {
      if (num > max1) {
        max2 = max1;
        max1 = num;
      } else if (num > max2) {
        max2 = num;
      }

      if (num < min1) {
        min2 = min1;
        min1 = num;
      } else if (num < min2) {
        min2 = num;
      }
    }

    return (max1 * max2) - (min1 * min2);
  }
}
