package AaronCL.LeetCode.question112;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/15 18:14:14
 * @Version V1.0
 * @Description: TODO
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

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        if(root.left == null && root.right == null&&root.val==sum){
            return true;
        }

        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
