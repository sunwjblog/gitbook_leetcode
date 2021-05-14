package com.sunwj.leetcode.medium;

//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
// 示例：
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
//
// Related Topics 链表 数学
// 👍 4719 👎 0



//Java：两数相加
public class P2AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
        // TO TEST
        ListNode l1 = new P2AddTwoNumbers().new ListNode(5);
        l1.next = new P2AddTwoNumbers().new ListNode(4);
        l1.next.next = new P2AddTwoNumbers().new ListNode(3);

        ListNode l2 = new P2AddTwoNumbers().new ListNode(5);
        l2.next = new P2AddTwoNumbers().new ListNode(6);
        l2.next.next = new P2AddTwoNumbers().new ListNode(4);

        System.out.println(solution.addTwoNumbers(l1,l2));


    }
    //leetcode submit region begin(Prohibit modification and deletion)

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode(0);
            ListNode d = res;
            ListNode p = l1;
            ListNode q = l2;
            int sum = 0;
            while (p!=null && p!=null){
                sum /= 10;
                if (p != null) {
                    sum += p.val;
                    p = p.next;
                }
                if (q != null) {
                    sum += q.val;
                    q = q.next;
                }
                d.next = new ListNode(sum % 10);
                d = d.next;
            }
            if (sum / 10 == 1) {
                d.next = new ListNode(1);
            }
            return res.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
