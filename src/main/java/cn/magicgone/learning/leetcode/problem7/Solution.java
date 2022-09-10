package cn.magicgone.learning.leetcode.problem7;

public class Solution {
    public int reverse(int x) {
        boolean negative = false;
        String str = String.valueOf(x);
        if (x < 0) {
            negative = true;
        }

        if (negative) {
            str = str.substring(1);
        }
        str = new StringBuilder(str).reverse().toString();
        if (negative) {
            str = "-" + str;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
