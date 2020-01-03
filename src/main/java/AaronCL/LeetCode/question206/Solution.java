package AaronCL.LeetCode.question206;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/12/24 20:48:48
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution    {
    public static void main(String a[]){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        reverseList2(node1);
        System.out.println("");
    }
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        Stack<ListNode> stack=new Stack<ListNode>();
        while(head!=null){
            ListNode temp=new ListNode(head.val);
            stack.push(temp);
            head=head.next;
        }
        ListNode result=stack.pop();
        ListNode resultHead=result;
        while(!stack.empty()){
            result.next=stack.pop();
            result=result.next;
        }
        return resultHead;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0) ;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = result.next;
            result.next = temp;
            head = head.next;
        }
        return result.next;
    }
}
