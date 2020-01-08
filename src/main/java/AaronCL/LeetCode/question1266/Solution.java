package AaronCL.LeetCode.question1266;

import org.junit.Test;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/8 11:03:03
 * @Version V1.0
 * @Description: TODO
 **/
public class Solution {
    @Test
    public void test(){
        minTimeToVisitAllPoints(new int[][]{
                {1,1},{3,4},{-1,0}
        });
    }
    public int minTimeToVisitAllPoints(int[][] points) {
       /* int result=0;
        for(int i=0;i<points.length-1;i++){
            result=result+points[i+1][0]-points[i][0]+points[0][i+1]-points[0][i];
        }
        return result;*/
        if(points.length <= 1) return 0;
        int ans = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x = Math.abs(points[i+1][0] - points[i][0]);
            int y = Math.abs(points[i+1][1] - points[i][1]);
            ans += Math.min(x, y);
            ans += Math.abs(x - y);
        }
        return ans;
    }
}
