package homework.h05;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class T2 {
  public static int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int left = 0;
    int right = n - 1;

    for (int i = n - 1; i >= 0; i--) {
      int squareLeft = nums[left] * nums[left];
      int squareRight = nums[right] * nums[right];

      if (squareLeft > squareRight) {
        result[i] = squareLeft;
        left++;
      } else {
        result[i] = squareRight;
        right--;
      }
    }

    return result;
  }
}
