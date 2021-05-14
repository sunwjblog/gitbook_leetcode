package com.sunwj.leetcode.medium;

//你的面前有一堵矩形的、由 n 行砖块组成的砖墙。这些砖块高度相同（也就是一个单位高）但是宽度不同。每一行砖块的宽度之和应该相等。
//
// 你现在要画一条 自顶向下 的、穿过 最少 砖块的垂线。如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你不能沿着墙的两个垂直边缘之一画线，这样显然是没
//有穿过一块砖的。
//
// 给你一个二维数组 wall ，该数组包含这堵墙的相关信息。其中，wall[i] 是一个代表从左至右每块砖的宽度的数组。你需要找出怎样画才能使这条线 穿过的
//砖块数量最少 ，并且返回 穿过的砖块数量 。
//
//
//
// 示例 1：
//
//
//输入：wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
//输出：2
//
//
// 示例 2：
//
//
//输入：wall = [[1],[1],[1]]
//输出：3
//
//
//
// 提示：
//
//
// n == wall.length
// 1 <= n <= 104
// 1 <= wall[i].length <= 104
// 1 <= sum(wall[i].length) <= 2 * 104
// 对于每一行 i ，sum(wall[i]) 应当是相同的
// 1 <= wall[i][j] <= 231 - 1
//
// Related Topics 哈希表
// 👍 194 👎 0


import java.util.*;

//Java：砖墙
public class P554BrickWall{
    public static void main(String[] args) {
        Solution solution = new P554BrickWall().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int leastBricks(List<List<Integer>> wall) {

            // 记录每一行长度从左到右边缘的相同的次数
            Map<Integer,Integer> map = new HashMap<>();

            // 遍历每一行
            for (List<Integer> wa : wall) {

                // 获取每一行的长度
                int size = wa.size();

                // 每一行的累加和
                int sum = 0;

                for (int i = 0; i < size - 1; i++) {
                    // 记录边缘长度，并存入缓存中
                    sum += wa.get(i);
                    map.put(sum, map.getOrDefault(sum,0) + 1);
                }
            }

            // 求缓存中边缘次数出现最多是多少行
            int maxCnt = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                maxCnt = Math.max(maxCnt,entry.getValue());
            }

            // 总行-边缘数出现最多，就是最少穿过行
            return wall.size() - maxCnt;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}