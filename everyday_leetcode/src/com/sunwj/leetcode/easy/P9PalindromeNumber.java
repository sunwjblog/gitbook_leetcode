package leetcodetest.easy;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 19:56<br>
 * 描述:  TODO<br>
 *
 *     //Java：回文数
 * //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * //
 * // 示例 1:
 * //
 * // 输入: 121
 * //输出: true
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: -121
 * //输出: false
 * //解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: 10
 * //输出: false
 * //解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * //
 * //
 * // 进阶:
 * //
 * // 你能不将整数转为字符串来解决这个问题吗？
 * // Related Topics 数学
 */
public class P9PalindromeNumber{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        //耗时9秒
      /*  int result = 0;
        int t = x;
        while (x != 0 && x > 0){
            int temp = x % 10;
            int tempRes = result * 10 + temp;
            //如果数字溢出，直接返回0
            if ((tempRes - temp) / 10 != result)
                return false;
            result = tempRes;
            x = x / 10;
        }
        return  result == t;*/

      //耗时 8秒
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
//        if (x < 0 || (x % 10 == 0 && x != 0)) {
//            return false;
//        }
//
//        int revertedNumber = 0;
//        while (x > revertedNumber) {
//            revertedNumber = revertedNumber * 10 + x % 10;
//            x /= 10;
//        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
//        return x == revertedNumber || x == revertedNumber / 10;


        // 判断是否为负数
        if(x<0) return false;
        int ret = 0;
        // 正数反转
        while(x>0){
            int tmp = ret;
            tmp *= 10;
            tmp += x % 10;
            x /= 10;
            //判断是否超出范围
            if(tmp / 10 != ret) return false;
            ret = tmp;
        }
        return x == ret ? true : false;
    }
}
