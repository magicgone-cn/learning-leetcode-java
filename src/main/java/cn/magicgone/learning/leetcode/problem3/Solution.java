package cn.magicgone.learning.leetcode.problem3;

import java.util.HashMap;
import java.util.Map;

/**
 * 从头开始循环，当前串使用<code>HashMap<Char,Integer></code>记录
 * 分为start/end两个指针，初始指向开头
 * end向右移动，直到遇到重复串
 * strat向右移动，直到遇到遇到重复串，移动过程中，从HashMap中删除路过的字符
 * start指向重复串+1,end指向重复串
 * 比较此时的字符串长度和历史长度，如果比历史值大，则更新
 * 判断end是否移到最后，如果最后则返回历史长度，否则继续移动end
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        int maxlength = 0;
        int start = 0,end = 0;
        Map<Character, Integer> substrMap = new HashMap<>();
        while(end < s.length()){

            if(!substrMap.containsKey(array[end])){
                substrMap.put(array[end],end);
                end++;

                if(end - start > maxlength){
                    maxlength = end - start;
                }

                continue;
            }

            // end遇到重复串，找到重复串的位置，start移动至重复串+1,hashmap更新
            int startTarget = substrMap.get(array[end])+1;
            for (int i = start; i < startTarget; i++) {
                substrMap.remove(array[i]);
            }
            substrMap.put(array[end],end);
            start = startTarget;

            // 下一循环
            end++;
        }
        return maxlength;

    }
}
