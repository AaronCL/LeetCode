package AaronCL.LeetCode.question590;

import java.util.List;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/10 16:16:16
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
