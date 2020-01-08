package AaronCL.LeetCode.question938;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/8 13:56:56
 * @Version V1.0
 * @Description:
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 *
 * 二叉搜索树保证具有唯一的值。
 **/
public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null){
            return 0;
        }
        if (root == null) return 0;

        if(root.val >= L && root.val <= R) {
            //当前节点再两数之间，把自身值加到结果里取，并往左右子节点递归
            return root.val + rangeSumBST(root.left, L ,R) + rangeSumBST(root.right, L , R);
        } else if(root.val < L){
            //当前节点小于L，往右子节点寻找
            return rangeSumBST(root.right, L, R);
        } else {
            //当前节点大于R，往左子节点寻找
            return rangeSumBST(root.left, L, R);
        }
    }
}
