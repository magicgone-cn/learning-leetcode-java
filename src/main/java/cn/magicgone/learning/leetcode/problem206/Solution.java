package cn.magicgone.learning.leetcode.problem206;


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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tail = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }
}
