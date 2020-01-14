package AaronCL.LeetCode.question374;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/13 18:28:28
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    // TODO: 2020/1/13 翻车 重做 
    public int guessNumber(int n) {
        int result = 1111111111;
        while (guess(result) != 0) {
            result = result + guess(result);
            guess(result);
        }
        return result;
    }

    int guess(int num){
        return 0;
    }
}
