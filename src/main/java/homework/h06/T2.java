package homework.h06;

public class T2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println("isPalindrome: " + solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}

class Solution2 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
