package AaronCL.LeetCode.question86;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/29 22:42:42
 * @Version V1.0
 * @Description:
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 *  **/
import org.junit.Test;

public class Solution {
    @Test
    public void test(){
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(2);
        listNode1.next=listNode4;
        listNode4.next=listNode3;
        listNode3.next=listNode2;
        listNode2.next=listNode5;
        listNode5.next=listNode6;
        partition(listNode1,3);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode result = null;
        ListNode dayu = null;
        ListNode dayuhead = null;
        ListNode xiaoyu = null;
        ListNode xiaoyuhead = null;
        for (; head != null; head = head.next) {
            ListNode temp=new ListNode(head.val);
            if (head.val<x) {
                if(xiaoyu!=null){
                    xiaoyu.next=temp;
                    xiaoyu=xiaoyu.next;
                }else{
                    xiaoyu=temp;
                    if(xiaoyuhead==null){
                        xiaoyuhead=temp;
                    }
                    // xiaoyu=xiaoyu.next;
                }
            } else {
                if(dayu!=null){
                    dayu.next=temp;
                    dayu=dayu.next;
                }else{
                    dayu=temp;
                    if(dayuhead==null){
                        dayuhead=temp;
                    }
                    //dayu=dayu.next;
                }
            }
        }
        xiaoyu.next=dayuhead;
        result=xiaoyuhead;
        return result;
    }
}