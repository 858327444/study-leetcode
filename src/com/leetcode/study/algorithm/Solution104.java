package com.leetcode.study.algorithm;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Program Name: leetcode-study
 * Created by yanlp on 2020-12-28
 *
 * @author yanlp
 * @version 1.0
 */
class TreeNode {
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

public class Solution104 {
    public  static  int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode0 = new TreeNode();
        treeNode0.val = 3;

        TreeNode treeNode1 = new TreeNode();
        treeNode1.val = 9;

        TreeNode treeNode2 = new TreeNode();
        treeNode2.val = 20;

        treeNode0.left = treeNode1;
        treeNode0.right = treeNode2;

        TreeNode treeNode3 = new TreeNode();
        treeNode3.val = 15;

        TreeNode treeNode4 = new TreeNode();
        treeNode4.val = 17;

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        System.out.println(maxDepth(treeNode0));


    }
}