package com.sunwj.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 23:10<br>
 * 描述:  TODO<br>
 */
//Java：两数之和
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表
// 👍 8679 👎 0

public class P1TwoSum{
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] test = new int[]{3,2,4};
        System.out.println(solution.twoSum(test,6));
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> tempMap = new HashMap<Integer,Integer>();
//        for (int i=0; i < nums.length; i++){
//            if(nums[i] < target) {
//                tempMap.put(nums[i],i);
//            }
//        }
//        for (int i=0; i < nums.length; i++){
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
        for (int i =0 ; i<nums.length; i++){
            int complement = target - nums[i];
            if (tempMap.containsKey(complement) && tempMap.get(complement) != i) {
                return new int[] { i, tempMap.get(complement) };
            }
            tempMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
//leetcode submit region end(Prohibit modification and deletion)