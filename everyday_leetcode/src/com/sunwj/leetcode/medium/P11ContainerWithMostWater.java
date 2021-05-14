package com.sunwj.leetcode.medium;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/20 23:01<br>
 * 描述:  TODO<br>
 *     //Java：盛最多水的容器
 * //给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
 * //ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * //
 * // 说明：你不能倾斜容器，且 n 的值至少为 2。
 * //
 * //
 * //
 * //
 * //
 * // 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * //
 * //
 * //
 * // 示例：
 * //
 * // 输入：[1,8,6,2,5,4,8,3,7]
 * //输出：49
 * // Related Topics 数组 双指针
 * // 👍 1649 👎 0
 */
public class P11ContainerWithMostWater{
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        int[] test = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(test));
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution11 {
    public int maxArea(int[] height) {
        //嵌套循环求解
       /* int sum = 0;
        for (int i = 0; i < height.length-1; i++){
            for (int j = i+1; j < height.length;j++){
                int area = (j - i) * Math.min(height[i],height[j]);
                sum = Math.max(sum,area);
            }
        }
        return sum;*/
       //数组两头夹逼的方式
        int sum = 0;
        for (int i = 0,j = height.length-1; i < j;){
            int hight = height[i] < height[j] ? height[i++] : height[j--];
            int area = (j - i + 1) * hight;
            sum = Math.max(sum,area);
        }
        return sum;
    }
}