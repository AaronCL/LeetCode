package AaronCL.LeetCode.question66;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/3 17:01:01
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    @Test
    public void test(){
        int[] nums=new int[]{9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0){
            return digits;
        }
        int[] result=null;
        if(digits[digits.length-1]==9){
            result=new int[digits.length+1];
            result[digits.length-1]=1;
            result[digits.length]=0;
        }else{
            result=new int[digits.length];
            result[digits.length-1]=digits[digits.length-1]+1;
        }
        for(int i=0;i<digits.length-1;i++){
                result[i]=digits[i];
        }
        return result;
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

}
