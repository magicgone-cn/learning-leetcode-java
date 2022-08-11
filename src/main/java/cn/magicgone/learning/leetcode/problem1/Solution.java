package cn.magicgone.learning.leetcode.problem1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * 数据结构为<value,index>
         */
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int targetValue = target - currentValue;
            if (indexMap.containsKey(targetValue)) {
                return new int[]{indexMap.get(targetValue), i};
            }

            indexMap.put(currentValue, i);
        }

        throw new RuntimeException("no solution");
    }
}
