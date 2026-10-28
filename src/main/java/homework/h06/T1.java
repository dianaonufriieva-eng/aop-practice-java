package homework.h06;

// https://leetcode.com/problems/valid-anagram/description/
public class T1 {

  public static void main(String[] args) {
    String s1 = "anagram", t1 = "nagaram";
    System.out.println("isAnagram: " + isAnagram(s1, t1));

    String s2 = "rat", t2 = "car";
    System.out.println("isAnagram: " + isAnagram(s2, t2));
  }

  public static boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
      if (c != 0) {
        return false;
      }
    }

    return true;
  }
}
