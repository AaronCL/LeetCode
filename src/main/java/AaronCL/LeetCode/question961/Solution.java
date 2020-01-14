package AaronCL.LeetCode.question961;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/13 13:43:43
 * @Version V1.0
 * @Description:
 *
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 *
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *  
 *
 * 提示：
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 *
 **/
public class Solution {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        return A[A.length/2]==A[A.length-1]?A[A.length/2]:A[A.length/2-1];
    }
}
