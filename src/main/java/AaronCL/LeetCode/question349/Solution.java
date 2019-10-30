package AaronCL.LeetCode.question349;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2019/10/30 14:41:41
 * @Version V1.0
 * @Description:
 * 给定两个数组，编写一个函数来计算它们的交集
 **/
public class Solution {
    public Integer[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                    set.add(nums1[i]);
            }
        }
        Integer[] nums=set.toArray(new Integer[]{});
        return nums;
    }
}
