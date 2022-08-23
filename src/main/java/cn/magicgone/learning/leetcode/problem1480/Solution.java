package cn.magicgone.learning.leetcode.problem1480;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sums[i] = nums[i] + sum;
            sum = sums[i];
        }
        return sums;
    }
}