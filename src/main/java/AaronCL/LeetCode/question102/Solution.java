package AaronCL.LeetCode.question102;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/3 16:58:58
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
   /*
    输入：
            [3,9,20,null,null,15,7]
    输出：
            [[3]]
    预期：
            [[3],[9,20],[15,7]]
            */
    @Test
    public void test() {
        TreeNode treeNode1=new TreeNode(3);
        TreeNode treeNode2=new TreeNode(9);
        TreeNode treeNode3=new TreeNode(20);
        TreeNode treeNode4=new TreeNode(15);
        TreeNode treeNode5=new TreeNode(7);
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;
        levelOrder(treeNode1);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return null;
        }
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<TreeNode> treeNodeQueue=new LinkedBlockingQueue  <TreeNode>();
        Queue<TreeNode> treeNodeQueue2=new LinkedBlockingQueue <TreeNode>();
        List<Integer> list=new ArrayList<Integer>();
        list.add(root.val);
        result.add(list);
        treeNodeQueue.add(root);
        while(!treeNodeQueue.isEmpty()||!treeNodeQueue2.isEmpty()){
            List<Integer> temp=new ArrayList<Integer>();
            while(!treeNodeQueue.isEmpty()){
                TreeNode treeNode=treeNodeQueue.poll();
                treeNodeQueue2.add(treeNode.left);
                treeNodeQueue2.add(treeNode.right);
                temp.add(treeNode.left.val);
                temp.add(treeNode.right.val);
            }
            result.add(temp);
            temp=new ArrayList<Integer>();
            while(!treeNodeQueue2.isEmpty()){
                TreeNode treeNode=treeNodeQueue2.poll();
                treeNodeQueue.add(treeNode.left);
                treeNodeQueue.add(treeNode.right);
                temp.add(treeNode.left.val);
                temp.add(treeNode.right.val);
            }
            result.add(temp);
        }
        return result;
    }
}
