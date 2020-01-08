package AaronCL.LeetCode.questionLCP1;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/8 10:23:23
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }

        return count;
    }
}
