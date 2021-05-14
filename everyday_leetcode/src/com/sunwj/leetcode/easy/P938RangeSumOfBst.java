package com.sunwj.leetcode.easy;//给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
//
//
//
// 示例 1：
//
//
//输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
//输出：32
//
//
// 示例 2：
//
//
//输入：root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//输出：23
//
//
//
//
// 提示：
//
//
// 树中节点数目在范围 [1, 2 * 104] 内
// 1 <= Node.val <= 105
// 1 <= low <= high <= 105
// 所有 Node.val 互不相同
//
// Related Topics 树 深度优先搜索 递归
// 👍 219 👎 0



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：二叉搜索树的范围和
public class P938RangeSumOfBst{
    public static void main(String[] args) {
        Solution solution = new P938RangeSumOfBst().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {

            List<Integer> lowandHightNodeList = new ArrayList<>();
            lowandHightNodeList = getBetweenLowAndHighArr(root,low,high,lowandHightNodeList);
            int sum = 0;
            for (Integer val : lowandHightNodeList) {
                sum += val;
            }
            return sum;
        }

        private List<Integer> getBetweenLowAndHighArr(TreeNode root, int low, int high,List<Integer> valArr){

            if (root != null){
                if (root.val >= low && root.val <= high)
                    valArr.add(root.val);
                getBetweenLowAndHighArr(root.left,low,high,valArr);
                getBetweenLowAndHighArr(root.right,low,high,valArr);
            }
            return valArr;
        }

        // 深度优先
       /* public int rangeSumBST2(TreeNode root, int low, int high) {

                if (root == null)
                    return 0;
                if (root.val > high)
                    rangeSumBST2(root.left,low,high);

                if (root.val < low)
                    rangeSumBST2(root.right,low,high);

                return root.val + rangeSumBST2(root.left,low,high) + rangeSumBST2(root.right,low,high);
            }
        }

        private List<Integer> getBetweenLowAndHighArr(TreeNode root, int low, int high,List<Integer> valArr){

            if (root != null){
                if (root.val >= low && root.val <= high)
                    valArr.add(root.val);
                getBetweenLowAndHighArr(root.left,low,high,valArr);
                getBetweenLowAndHighArr(root.right,low,high,valArr);
            }
            return valArr;
        }*/
    }
//leetcode submit region end(Prohibit modification and deletion)

}