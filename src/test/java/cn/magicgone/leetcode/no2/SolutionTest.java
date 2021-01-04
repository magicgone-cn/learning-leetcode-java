package cn.magicgone.leetcode.no2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        test(new int[]{9,9,9,9,9,9,9},new int[]{9,9,9,9},new int[]{8,9,9,9,0,0,0,1});
    }

    void test(int[] a1,int[] a2, int[] r){
        ListNode l1 = buildListNode(a1);
        ListNode l2 = buildListNode(a2);
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1,l2);
        assertArrayEquals(r,convertListNodeToArray(result));
    }

    private static ListNode buildListNode(int[] args){
        ListNode listNode = new ListNode();
        ListNode cursor = listNode;
        for (int arg : args) {
            cursor.next = new ListNode(arg);
            cursor = cursor.next;
        }
        return listNode.next;
    }

    private static int[] convertListNodeToArray(ListNode listNode){
        List<Integer> list = new ArrayList<>();
        ListNode cursor = listNode;
        while(cursor != null){
            list.add(cursor.val);
            cursor = cursor.next;
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
