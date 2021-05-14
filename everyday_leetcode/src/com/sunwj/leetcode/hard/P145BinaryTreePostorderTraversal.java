package com.sunwj.leetcode.hard;

//给定一个二叉树，返回它的 后序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [3,2,1]
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树
// 👍 362 👎 0

import java.util.ArrayList;
import java.util.List;

//Java：二叉树的后序遍历
public class P145BinaryTreePostorderTraversal{
    public static void main(String[] args) {
        Solution solution = new P145BinaryTreePostorderTraversal().new Solution();
        // TO TEST
        System.out.println(solution.postorderTraversal());
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<Integer> postorderTraversal() {
            List<Integer> res = new ArrayList<>();
            TreeNode root = new TreeNode(1);
            root.right = new TreeNode(2);
            root.right.left = new TreeNode(3);

            return helper(root,res);
        }

        public void postOrderRecur(TreeNode head,List<Integer> res) {
            if (head == null) {
                return;
            }
            postOrderRecur(head.left,res);
            postOrderRecur(head.right,res);
            System.out.print(head.val + " ");
        }

        private List<Integer> helper(TreeNode root, List<Integer> res) {
            if (root != null) {
                helper(root.left,res);
                helper(root.right,res);
                res.add(root.val);
            }
            return res;
        }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
