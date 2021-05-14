package com.sunwj.leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/20 23:34<br>
 * 描述:  TODO<br>
 //Java：三数之和
 //给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
 //的三元组。
 //
 // 注意：答案中不可以包含重复的三元组。
 //
 //
 //
 // 示例：
 //
 // 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 //
 //满足要求的三元组集合为：
 //[
 //  [-1, 0, 1],
 //  [-1, -1, 2]
 //]
 //
 // Related Topics 数组 双指针
 // 👍 2397 👎 0
*/
public class P15ThreeSum {
    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution15 {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {

            if (i == 0 || (i > 0 && num[i] != num[i-1])) {

                int lo = i+1, hi = num.length-1, sum = 0 - num[i];

                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
 //leetcode submit region end(Prohibit modification and deletion)
