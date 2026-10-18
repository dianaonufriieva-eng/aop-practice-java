package homework.h06;

public class T1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("isAnagram: " + solution.isAnagram("anagram", "nagaram"));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
}
