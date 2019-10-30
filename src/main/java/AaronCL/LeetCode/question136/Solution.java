package AaronCL.LeetCode.question136;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/30 14:45:45
 * @Version V1.0
 * @Description:
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
 **/
public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
