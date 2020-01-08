package AaronCL.LeetCode.question7;

import org.junit.Test;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/7 17:53:53
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    @Test
    public void test(){
        reverse(103);
    }
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
