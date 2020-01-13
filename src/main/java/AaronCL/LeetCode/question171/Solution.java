package AaronCL.LeetCode.question171;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/13 13:40:40
 * @Version V1.0
 * @Description:
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 *
  **/
public class Solution {
    public int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int res = 0;
        for(int i = 0; i < charArray.length; i++) {
            res = res*26 + (charArray[i] - 'A' + 1);
        }

        return res;
    }
}
