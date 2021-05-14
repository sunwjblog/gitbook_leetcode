package com.sunwj.leetcode.easy;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 23:11<br>
 * 描述:  TODO<br>
 */
//Java：整数反转
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学
// 👍 2032 👎 0

public class P7ReverseInteger{
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        // TO TEST
        System.out.println(solution.reverse(-321));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution7 {
    public int reverse(int x) {

        if (x == Integer.MIN_VALUE) return 0;
        int neg = x<0 ? -1 : 1;
        x *= neg;
        int ret = 0;
        while (x>0){
            int tmp = ret;
            tmp *= 10;
            tmp += x % 10;
            x /= 10;
            if (tmp / 10 != ret) return 0;
            ret = tmp;

        }
        return ret * neg;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
