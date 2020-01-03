package AaronCL.LeetCode.question120;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/31 21:32:32
 * @Version V1.0
 * @Description: 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 **/
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        ExecutorService pool= Executors.newFixedThreadPool(32);
        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<TreeNode>> levelOrder(TreeNode root) {
        List<List<TreeNode>> result = new LinkedList<List<TreeNode>>();
        List<TreeNode> queue = new LinkedList<TreeNode>();
        List<TreeNode> temp = new LinkedList<TreeNode>();
        if (root == null) {
            return null;
        }
        else{
            queue.add(root);
            result.add(queue);
        }
        Iterator<TreeNode> iterable=queue.iterator();
        while (iterable.hasNext()) {
            TreeNode treeNode= iterable.next();
            temp.add(treeNode);

        }
        return result;
    }

}
