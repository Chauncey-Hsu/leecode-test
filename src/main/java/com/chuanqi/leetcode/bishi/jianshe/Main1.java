package com.chuanqi.leetcode.bishi.jianshe;

public class Main1 {

    public static void main(String[] args) {

    }


}

class Solution {
    public boolean judge(TreeNode root) {
        if (root.left != null && root.right != null) {
            boolean b1 =  new Solution().judge(root.right);
            boolean b2 =  new Solution().judge(root.left);
            if (!b1 || !b2) {
                return false;
            }
        } else if (root.left != null && root.right == null) {
            return false;
        }
        return true;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}