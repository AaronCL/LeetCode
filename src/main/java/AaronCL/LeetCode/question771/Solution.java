package AaronCL.LeetCode.question771;

/**
 * @ClassName Solution
 * @Author chenli23
 * @Date 2020/1/8 10:30:30
 * @Version V1.0
 * @Description:
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *  J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 **/
public class Solution {
    public int numJewelsInStones(String J, String S) {
         int result=0;
         char[] JChars=J.toCharArray();
         char[] SChars=S.toCharArray();
         for(int i=0;i<SChars.length;i++){
             for(int j=0;j<JChars.length;j++){
                 if(SChars[i]==JChars[j]){
                     result++;
                     break;
                 }
             }
         }
         return result;
    }
}
