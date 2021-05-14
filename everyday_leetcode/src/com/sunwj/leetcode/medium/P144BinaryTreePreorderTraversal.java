package com.sunwj.leetcode.medium;

//给定一个二叉树，返回它的 前序 遍历。
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
//输出: [1,2,3]
//
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树
// 👍 333 👎 0


import java.util.ArrayList;
import java.util.List;

//Java：二叉树的前序遍历
public class P144BinaryTreePreorderTraversal{
    public static void main(String[] args) {
        Solution solution = new P144BinaryTreePreorderTraversal().new Solution();
        // TO TEST
        System.out.println(solution.preorderTraversal().toString());
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
        public List<Integer> preorderTraversal() {
            List<Integer> res = new ArrayList<>();
            TreeNode root = new TreeNode(1);
            root.right = new TreeNode(2);
            root.right.left = new TreeNode(3);

            return helper(root,res);
        }

        public  List<Integer> preOrderRecur(List<Integer> res, TreeNode head) {
            if (head == null) {
                return null;
            }
            res.add(head.val);
            //System.out.print(head.val + " ");
            preOrderRecur(res,head.left);
            preOrderRecur(res,head.right);
            return res;
        }

        private List<Integer> helper(TreeNode root, List<Integer> res) {
            if (root != null) {
                res.add(root.val);
                if (root.left != null)
                    helper(root.left,res);
                if (root.right != null)
                    helper(root.right,res);
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
