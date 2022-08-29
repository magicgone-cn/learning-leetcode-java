package cn.magicgone.learning.leetcode.problem876;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node);
        }
        return list.get(list.size() / 2);
    }
}
