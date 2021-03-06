package com.sunwj.leetcode.medium;

import java.util.*;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/5 3:51 下午
 *
 * //给你一个整数数组 nums ，你可以对它进行一些操作。
 * //
 * // 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。之后，你必须删除每个等于 nums[i] - 1 或 nums[i] +
 * // 1 的元素。
 * //
 * // 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * //
 * //输入：nums = [3,4,2]
 * //输出：6
 * //解释：
 * //删除 4 获得 4 个点数，因此 3 也被删除。
 * //之后，删除 2 获得 2 个点数。总共获得 6 个点数。
 * //
 * //
 * // 示例 2：
 * //
 * //
 * //输入：nums = [2,2,3,3,3,4]
 * //输出：9
 * //解释：
 * //删除 3 获得 3 个点数，接着要删除两个 2 和 4 。
 * //之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 * //总共获得 9 个点数。
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 1 <= nums.length <= 2 * 104
 * // 1 <= nums[i] <= 104
 * //
 * // Related Topics 动态规划
 * // 👍 295 👎 0
 */
//Java：删除并获得点数
public class P740DeleteAndEarn{
    public static void main(String[] args) {
        Solution solution = new P740DeleteAndEarn().new Solution();
        // TO TEST
        System.out.println(solution.deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int deleteAndEarn(int[] nums) {
            int maxVal = 0;
            for (int val : nums) {
                maxVal = Math.max(maxVal, val);
            }
            int[] sum = new int[maxVal + 1];
            for (int val : nums) {
                sum[val] += val;
            }
            return rob(sum);
        }

        public int rob(int[] nums) {
            int size = nums.length;
            int first = nums[0], second = Math.max(nums[0], nums[1]);
            for (int i = 2; i < size; i++) {
                int temp = second;
                second = Math.max(first + nums[i], second);
                first = temp;
            }
            return second;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}