package cn.magicgone.learning.leetcode.problem15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Stack<Integer>> map = new TreeMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, new Stack<>());
            map.get(num).push(num);
        }

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>(map.keySet());

        for (int i = 0; i < list.size(); i++) {
            Integer firstNum = list.get(i);
            map.get(firstNum).pop();
            for (int j = i; j < list.size(); j++) {
                Integer secondNum = list.get(j);
                if (map.get(secondNum).isEmpty()) {
                    continue;
                }
                map.get(secondNum).pop();

                Integer thirdNum = 0 - firstNum - secondNum;
                if (thirdNum >= secondNum) {
                    if (map.containsKey(thirdNum) && !map.get(thirdNum).isEmpty()) {
                        result.add(Arrays.asList(firstNum, secondNum, thirdNum));
                    }
                }

                map.get(secondNum).push(secondNum);
            }
        }

        return result;

    }
}
