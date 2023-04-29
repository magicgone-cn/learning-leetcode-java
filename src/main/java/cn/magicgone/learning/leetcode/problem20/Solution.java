package cn.magicgone.learning.leetcode.problem20;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && match(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    static boolean match(char s1, char s2) {
        return s1 == '(' && s2 == ')' || s1 == '{' && s2 == '}' || s1 == '[' && s2 == ']';
    }
}
