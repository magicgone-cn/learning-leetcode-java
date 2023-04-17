package cn.magicgone.learning.leetcode.problem15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.compute(num, (key, oldValue) -> oldValue + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int firstNum = entry.getKey();
            entry.setValue(entry.getValue() - 1);
            for (Map.Entry<Integer, Integer> secondEntry : map.entrySet()) {
                int secondNum = secondEntry.getKey();
                if (secondEntry.getValue() <= 0 || secondNum < firstNum) {
                    continue;
                }
                int thirdNum = 0 - firstNum - secondNum;
                if (thirdNum < secondNum) {
                    continue;
                }

                int thirdNumCount = map.getOrDefault(thirdNum, 0);
                if (thirdNum == secondNum) {
                    if (thirdNumCount >= 2) {
                        result.add(Arrays.asList(firstNum, secondNum, thirdNum));
                    }
                    continue;
                }

                if (thirdNumCount > 0) {
                    result.add(Arrays.asList(firstNum, secondNum, thirdNum));
                }
            }
        }

        return result;

    }
}
