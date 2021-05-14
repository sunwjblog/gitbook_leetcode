package leetcodetest.easy;//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
// Related Topics 字符串
// 👍 1562 👎 0



//Java：最长公共前缀
public class P14LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new P14LongestCommonPrefix().new Solution();
        // TO TEST
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight","floss"}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if (strs == null || strs.length == 0) return "";

            String first = strs[0];
            for (int i = 1; i<strs.length; i++){
                first = this.getCommonStrContent(first,strs[i]);
                if (first.length() == 0){
                    break;
                }
            }
            return first;
        }

        private String getCommonStrContent(String str1,String str2){
            int length = Math.min(str1.length(),str2.length());
            int index = 0;
            while (index < length && (str1.charAt(index) == str2.charAt(index))){
                    index++;
            }
            return str1.substring(0,index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}