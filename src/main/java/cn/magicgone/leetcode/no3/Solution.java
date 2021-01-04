package cn.magicgone.leetcode.no3;

import java.util.HashSet;

/**
 * 从头开始循环，当前最长串记录在HashSet中
 * 时间复杂度O(xn),x为字符的可选范围，不算大，可接受
 * 应该会有更好的算法
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> substr = new HashSet<>();
            for (int j = 0; true; j++) {
                Character c = array[i+j];

                // 遇到重复字符
                if(substr.contains(c)){
                    length = Math.max(length,j);
                    break;
                }

                substr.add(c);

                // 已循环到最后一个字符
                if(i + j == array.length - 1){
                    length = Math.max(length,j+1);
                    break;
                }
            }
        }

        return length;
    }
}
