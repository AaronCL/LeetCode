package AaronCL.LeetCode.question589;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/16 17:27:27
 * @Version V1.0
 * @Description:
 *
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 **/
public class Solution {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> integerList=new LinkedList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return integerList;
        }
        if(root!=null){
            integerList.add(root.val);
        }
        List<Node> children=root.children;
        Iterator<Node> iterator=children.iterator();
        while(iterator.hasNext()){
            preorder(iterator.next());
        }
        return integerList;
    }
}
