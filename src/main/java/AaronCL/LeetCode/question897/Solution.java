package AaronCL.LeetCode.question897;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/29 22:44:44
 * @Version V1.0
 * @Description: 给定一个树，按中序遍历重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
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

    TreeNode head;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.right = increasingBST(root.right);
        if (root.left != null) {
            TreeNode node = root.left;
            root.left = null;
            head = node;
            while (node.right != null)
                node = node.right;
            node.right = root;
            return increasingBST(head);
        } else
            return root;
    }
}
