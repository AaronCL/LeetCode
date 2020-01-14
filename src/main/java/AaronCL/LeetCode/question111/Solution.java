package AaronCL.LeetCode.question111;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/13 16:01:01
 * @Version V1.0
 * @Description: 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 *    3
 *  /  \
 * 9   20
 *    /  \
 *  15   7
 * 返回它的最小深度  2.
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
    // TODO: 2020/1/13  此题翻车 重做吧
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.left == null) && (root.right == null)) {
            return 1;
        }

        int leftH = 0;
        if (root.left == null && root.right != null) {
            leftH = 1 + minDepth(root.left);
        }
        int rightH = 0;
        if (root.right == null && root.left != null) {
            rightH = 1 + minDepth(root.right);
        }
        return 1 + Math.min(leftH, rightH);
    }

}
