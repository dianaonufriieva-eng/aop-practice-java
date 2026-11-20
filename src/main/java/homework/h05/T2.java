package homework.h05;

// https://leetcode.com/problems/squares-of-a-sorted-array/

public class T2 {
  public static int[] sortedSquares(int[] nums) {
    int[] squares = new int[nums.length];
    int left = 0;
    int right = nums.length - 1;

    for (int index = nums.length - 1; index >= 0; index--) {
      int leftSquare = nums[left] * nums[left];
      int rightSquare = nums[right] * nums[right];

      if (leftSquare > rightSquare) {
        squares[index] = leftSquare;
        left++;
      } else {
        squares[index] = rightSquare;
        right--;
      }
    }

    return squares;
  }
}
