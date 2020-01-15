package AaronCL.LeetCode.question704;

import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/15 10:23:23
 * @Version V1.0
 * @Description: 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Solution {
    //TODO 翻车 重做
    @Test
    public void test() {
        int[] nums = new int[]{-1, 0, 5};
        System.out.println(search(nums, 5));
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 1;
            } else {
                return -1;
            }
        }
        if (target == nums[(nums.length - 1) / 2]) {
            return (int) ((nums.length - 1) / 2);
        }
        int result = 0;
        if (target > nums[(nums.length - 1) / 2]) {
            int[] temp = new int[nums.length / 2];
            for (int i = (nums.length - 1) / 2 + 1; i < nums.length; i++) {
                temp[i - ((nums.length - 1) / 2 + 1)] = nums[i];
            }
            int res = search(temp, target);
            result = res == -1 ? -1 : res + nums.length / 2;
        } else {
            int[] temp = new int[nums.length / 2];
            for (int i = 0; i < nums.length / 2; i++) {
                temp[i] = nums[i];
            }
            result = search(temp, target);
        }
        return result <= -1 ? -1 : result;
    }

}
