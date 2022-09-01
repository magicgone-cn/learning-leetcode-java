package cn.magicgone.learning.leetcode.problem704;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return -1;
        }
        if (length == 1) {
            if (target == nums[0]) {
                return 0;
            } else {
                return -1;
            }
        }

        int middle = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int leftIndex = search(left, target);
        if (leftIndex == -1) {
            int[] right = Arrays.copyOfRange(nums, middle, nums.length);
            int rightIndex = search(right, target);
            if (rightIndex == -1) {
                return -1;
            } else {
                return left.length + search(right, target);
            }
        } else {
            return leftIndex;
        }
    }
}
