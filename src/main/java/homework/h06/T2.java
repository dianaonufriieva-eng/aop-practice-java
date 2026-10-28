package homework.h06;

// https://leetcode.com/problems/valid-palindrome/description/
public class T2 {

  public static void main(String[] args) {
    String s1 = "A man, a plan, a canal: Panama";
    System.out.println("isPalindrome: " + isPalindrome(s1));

    String s2 = "race a car";
    System.out.println("isPalindrome: " + isPalindrome(s2));

    String s3 = " ";
    System.out.println("isPalindrome: " + isPalindrome(s3));
  }

  public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

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
