package cn.magicgone.learning.leetcode.problem409;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestPalindrome(String s) {
        // 记录成对出现的字母数，如果还有剩余，则+1
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                result += 2;
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            result++;
        }

        return result;
    }
}
