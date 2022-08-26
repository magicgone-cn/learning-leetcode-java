package cn.magicgone.learning.leetcode.problem21;

import java.util.Objects;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ListNode listNode = this;
        while (listNode != null) {
            sb.append(listNode.val);
            if (listNode.next != null) {
                sb.append(",");
            }
            listNode = listNode.next;
        }
        return sb.append("]").toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}

public interface Solution {
    ListNode mergeTwoLists(ListNode list1, ListNode list2);
}

class RecursionSolution implements Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode listNode;
        if (list1.val <= list2.val) {
            listNode = list1;
            list1 = list1.next;
        } else {
            listNode = list2;
            list2 = list2.next;
        }
        ListNode mergedListNode = mergeTwoLists(list1, list2);
        listNode.next = mergedListNode;
        return listNode;
    }
}


