package cn.magicgone.learning.leetcode.problem724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSums = new int[nums.length];
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i] = nums[i] + prefixSum;
            prefixSum = prefixSums[i];
        }

        {
            int i = 0;
            int leftSum = 0;
            int rightSum = prefixSums[nums.length - 1] - prefixSums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        for (int i = 1; i < nums.length - 1; i++) {
            int leftSum = prefixSums[i - 1];
            int rightSum = prefixSums[nums.length - 1] - prefixSums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        {
            int i = nums.length - 1;
            int leftSum = prefixSums[i - 1];
            int rightSum = 0;
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
