package com.sunwj.leetcode.easy;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/20 23:25<br>
 * 描述:  TODO<br>
 *     //Java：爬楼梯
 * //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * //
 * // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * //
 * // 注意：给定 n 是一个正整数。
 * //
 * // 示例 1：
 * //
 * // 输入： 2
 * //输出： 2
 * //解释： 有两种方法可以爬到楼顶。
 * //1.  1 阶 + 1 阶
 * //2.  2 阶
 * //
 * // 示例 2：
 * //
 * // 输入： 3
 * //输出： 3
 * //解释： 有三种方法可以爬到楼顶。
 * //1.  1 阶 + 1 阶 + 1 阶
 * //2.  1 阶 + 2 阶
 * //3.  2 阶 + 1 阶
 * //
 * // Related Topics 动态规划
 * // 👍 1144 👎 0
 */
public class P70ClimbingStairs{
    public static void main(String[] args) {
        Solution70 solution = new Solution70();
        System.out.println(solution.climbStairs(5));
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution70 {
    public int climbStairs(int n) {
        int x = 0,y = 0,z = 1;
        for (int i = 1; i <=n; i++){
            x = y;
            y = z;
            z = x + y;
        }
        return z;
    }
}
