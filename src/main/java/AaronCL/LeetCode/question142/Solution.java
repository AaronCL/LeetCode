package AaronCL.LeetCode.question142;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/29 23:14:14
 * @Version V1.0
 * @Description: 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 说明：不允许修改给定的链表。
 **/
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        //设置快慢指针，快指针一次走两步，慢指针一次走一步
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            //如果快指针还没有走到末尾，就在走一步
            if (fast != null) {
                fast = fast.next;
            }
            //如果两个相遇，那么那个就是相遇的节点
            if (fast == slow) {
                break;
            }
        }
        //如果快指针不为空，那么慢指针一定不为空
        if (fast == null) {
            return null;
        }
        //相遇后，快指针回到起点，然后快慢指针一起走，再次相遇后就是交点
        fast = head;
        while (fast != null && slow != null) {
            if (fast == slow) {
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
