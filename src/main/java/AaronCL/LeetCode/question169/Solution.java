package AaronCL.LeetCode.question169;

import org.junit.Test;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/29 22:44:44
 * @Version V1.0
 * @Description:
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 **/
public class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int major=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==major){
                count++;
                if(count>=nums.length/2){
                    break;
                }
            }else{
                --count;
                if(count==0){
                    major=nums[i+1];
                }
            }
        }
        return major;
    }
}
