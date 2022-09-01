package cn.magicgone.learning.leetcode.problem102;

import java.util.*;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> currentQueue = new LinkedList<>();
        Queue<TreeNode> nextQueue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            currentQueue.add(root);
        }

        while (!currentQueue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            while (!currentQueue.isEmpty()) {
                TreeNode node = currentQueue.poll();
                levelList.add(node.val);
                if (node.left != null) {
                    nextQueue.offer(node.left);
                }
                if (node.right != null) {
                    nextQueue.offer(node.right);
                }
            }
            list.add(levelList);
            if (!nextQueue.isEmpty()) {
                currentQueue = nextQueue;
                nextQueue = new LinkedList<>();
            }
        }

        return list;
    }
}
