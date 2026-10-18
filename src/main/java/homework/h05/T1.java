package homework.h05;

public class T1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 6, 2, 7, 4};
        int result = solution.maxProductDifference(nums);
        System.out.println("Результат: " + result);
    }
}

class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }
}
