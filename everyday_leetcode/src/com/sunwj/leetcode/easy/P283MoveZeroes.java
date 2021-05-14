package com.sunwj.leetcode.easy;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 23:06<br>
 * 描述:  TODO<br>
 */
//Java：移动零
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针
// 👍 654 👎 0

public class P283MoveZeroes{
    public static void main(String[] args) {
        Solution283 solution = new Solution283();
        solution.moveZeroes(new int[]{0,0,1,2,3});
        System.out.println("-----------");
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution283 {
    public void moveZeroes(int[] nums) {
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)