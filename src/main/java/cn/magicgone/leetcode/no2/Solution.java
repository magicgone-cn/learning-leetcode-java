package cn.magicgone.leetcode.no2;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    /**
     * 两数相加
     * 个位数1 + 个位数2 + 进位数值 = 个位数结果 + 进位数值
     * 个位数结果追加进结果列表，进位数值参与下轮循环
     * 入参节点没有下一节点后，个位数为0
     * 两个入参节点都没有下一节点后，结束循环
     * 最后的进位数值不为0，还要追加一个节点
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode rtnNode = new ListNode(-1); // 创建一个虚拟节点，返回值返回此节点的下一节点
        ListNode lastNode = rtnNode; // 上轮循环的尾结点
        int balance = 0; // 进位数值
        ListNode l1Node = l1;
        ListNode l2Node = l2;

        while(l1Node != null || l2Node != null){

            int l1Val = 0;
            int l2Val = 0;
            if(l1Node != null){
                l1Val = l1Node.val;
            }
            if(l2Node != null){
                l2Val = l2Node.val;
            }

            int[] sum = addThreeNumbers(l1Val,l2Val,balance);
            ListNode currentNode = new ListNode(sum[0]);
            balance = sum[1];
            lastNode.next = currentNode;

            // 继续下一轮循环
            if(l1Node != null){
                l1Node = l1Node.next;
            }
            if(l2Node != null){
                l2Node = l2Node.next;
            }
            lastNode = currentNode;

        }

        // 进位数值不为空，则追加一个节点
        if(balance != 0){
            lastNode.next = new ListNode(balance);
        }

        return rtnNode.next;
    }

    /**
     * 两个个位数和上次运算进位的数值进行计算
     */
    private int[] addThreeNumbers(int l1, int l2, int balance){
        int sum = l1 + l2 + balance;
        return new int[]{ sum % 10 , sum / 10 };
    }


}
