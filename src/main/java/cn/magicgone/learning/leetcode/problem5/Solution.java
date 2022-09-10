package cn.magicgone.learning.leetcode.problem5;

public class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String longestStr = "";

        for (int i = 0; i < s.length(); i++) {
            int length = 1;
            String str = s.substring(i, i + 1);
            for (int j = 1; i - j >= 0 && i + j <= s.length() - 1; j++) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    length += 2;
                    str = s.substring(i - j, i + j + 1);
                } else {
                    break;
                }
            }

            if (length > maxLength) {
                maxLength = length;
                longestStr = str;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                continue;
            }
            int length = 2;
            String str = s.substring(i, i + 2);
            for (int j = 1; i - j >= 0 & i + 1 + j <= s.length() - 1; j++) {
                if (s.charAt(i - j) == s.charAt(i + 1 + j)) {
                    length += 2;
                    str = s.substring(i - j, i + 1 + j + 1);
                } else {
                    break;
                }
            }

            if (length > maxLength) {
                maxLength = length;
                longestStr = str;
            }
        }

        return longestStr;
    }
}
