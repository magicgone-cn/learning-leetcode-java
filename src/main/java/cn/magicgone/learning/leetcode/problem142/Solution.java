package cn.magicgone.learning.leetcode.problem142;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        for (ListNode node = head; node != null; node = node.next) {
            if (set.contains(node)) {
                return node;
            }
            set.add(node);
        }
        return null;
    }
}
