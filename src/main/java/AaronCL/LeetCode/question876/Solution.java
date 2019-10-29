package AaronCL.LeetCode.question876;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/29 22:44:44
 * @Version V1.0
 * @Description:
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 **/
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mid=null;
        if(null==head||null==head.next){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return fast;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
