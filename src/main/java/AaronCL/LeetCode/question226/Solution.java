package AaronCL.LeetCode.question226;

/**
 * @ClassName solution
 * @Author chenli23
 * @Date 2020/1/13 10:44:44
 * @Version V1.0
 * @Description:
 *
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        // 保存右子树
        TreeNode rightTree = root.right;
        // 交换左右子树的位置
        root.right = invertTree(root.left);
        root.left = invertTree(rightTree);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if(root==null){
            return root;
        }
        swap(root.left,root.right);
        if(root.left!=null){
           return invertTree2(root.left);
        }else{
            return invertTree2(root.right);
        }
    }

    public void swap(TreeNode left,TreeNode right){
        TreeNode temp=left;
        left=right;
        right=temp;
    }
}
