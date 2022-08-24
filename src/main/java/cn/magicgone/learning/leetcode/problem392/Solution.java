package cn.magicgone.learning.leetcode.problem392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0, j = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            for (; j < t.length(); j++) {
                char tChar = t.charAt(j);
                if (sChar == tChar) {
                    // 如果s已移动至末尾，则可以直接返回true
                    if (i == s.length() - 1) {
                        return true;
                    }
                    j++;
                    break;
                }
            }
            if (j >= t.length()) {
                return false;
            }
        }
        return true;
    }
}
