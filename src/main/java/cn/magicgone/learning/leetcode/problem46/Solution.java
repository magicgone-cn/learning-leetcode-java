package cn.magicgone.learning.leetcode.problem46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> list = new LinkedList<>();
            list.add(nums[0]);
            resultList.add(list);
            return resultList;
        }
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> list = merge(nums[i], permute(drawOutArray(nums, i)));
            resultList.addAll(list);
        }
        return resultList;
    }

    private static List<List<Integer>> merge(int num, List<List<Integer>> list) {
        for (List<Integer> row : list) {
            row.add(0, num);
        }
        return list;
    }

    private static int[] drawOutArray(int[] nums, int drawOutIndex) {
        int[] array = new int[nums.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i < drawOutIndex ? nums[i] : nums[i + 1];
        }
        return array;
    }
}
