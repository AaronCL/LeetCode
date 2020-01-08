package AaronCL.LeetCode.question27;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/7 18:25:25
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    public int removeElement(int[] nums, int val) {
         /* int result=0;
          if(nums==null||nums.length==0){
              return result;
          }
          for(int i=0;i<nums.length;i++){
              if(val==nums[i]){
                  nums[i]=0;
              }else{
                  result++;
              }
          }
          return result;

*/
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
