package com.sunwj.leetcode.easy;

import java.util.Arrays;

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表
// 👍 222 👎 0
//Java：有效的字母异位词
public class P242ValidAnagram{
    public static void main(String[] args) {
        Solution solution = new P242ValidAnagram().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            //思路1 暴力解法   分别排序两个字符串，如果相等，则为异位词
            /*char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            return Arrays.equals(sArray,tArray);*/

            //思路2 通过hash表的方式， 记录字符串出现的次数，最后次数为0则异位词
            //用一个计数器表计算 s 字母的频率，用 t 减少计数器表中的每个字母的计数器，然后检查计数器是否回到零。
            if(s.length() != t.length())
                return false;
            int[] counter = new int[26];
            for (int i = 0; i<s.length(); ++i){
                counter[s.charAt(i) - 'a']++;
                counter[t.charAt(i) - 'a']--;
            }
            for (int c : counter){
                if(c != 0){
                    return false;
                }
            }
            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
