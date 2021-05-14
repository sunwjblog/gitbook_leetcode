package leetcodetest.easy;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/24 10:58<br>
 * 描述:  TODO<br>
 */
//Java：旋转数组
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
// 示例 1:
//
// 输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
//
//
// 示例 2:
//
// 输入: [-1,-100,3,99] 和 k = 2
//输出: [3,99,-1,-100]
//解释:
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100]
//
// 说明:
//
//
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
// 要求使用空间复杂度为 O(1) 的 原地 算法。
//
// Related Topics 数组
// 👍 629 👎 0

public class P189RotateArray{
    public static void main(String[] args) {
        Solution189 solution = new Solution189();
        solution.rotate(new int[]{1,2,3,4},2);
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution189 {
    public void rotate(int[] nums, int k) {
        //暴力解法
        /*int temp,pre;
        for (int i=0; i<k; i++){
            pre = nums[nums.length-1];
            for (int j=0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }*/
        //额外数组的方法
        /*int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; ++i){
            a[(i+k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; ++i){
            nums[i] = a[i];
        }*/
        //使用反转
        k %= nums.length;
        //反转
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public void rev(int[] nums,int start,int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
