package AaronCL.LeetCode.question61;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/3 15:45:45
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    public static void main(String a[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        rotateRight(node1, 2);
        System.out.println("");
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            length++;
        }
        int step = k % length;
        ListNode fast = head;
        for (int i = 0; i < step; i++) {
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next=head;
        while(head!=slow){
            head=head.next;
        }
        ListNode result = head.next;
        head.next=null;
        return result;
    }
}
