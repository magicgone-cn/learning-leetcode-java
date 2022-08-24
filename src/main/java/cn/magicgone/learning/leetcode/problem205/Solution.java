package cn.magicgone.learning.leetcode.problem205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        int length = s.length();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < length; i++) {
            char sChar = sArray[i];
            char tChar = tArray[i];

            if (!map.containsKey(sChar)) {
                if (tSet.contains(tChar)) {
                    return false;
                }
                map.put(sChar, tChar);
                tSet.add(tChar);
                continue;
            }

            if (map.get(sChar) != tChar) {
                return false;
            }
        }

        return true;
    }
}
