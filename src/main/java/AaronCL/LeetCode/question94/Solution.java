package AaronCL.LeetCode.question94;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/29 22:45:45
 * @Version V1.0
 * @Description: 给定一个二叉树，返回它的中序 遍历
 **/
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(root.val);
        if (root.left == null) {
            inorderTraversal(root.left);

        } else {
            inorderTraversal(root.right);
        }
        return result;
    }
}
