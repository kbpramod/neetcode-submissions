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

class Solution {
    private int res = 0;
    private int preorder(TreeNode root) {
        if(root == null) return 0;
        int left  = preorder(root.left);
        int right = preorder(root.right);
        res = Math.max(left+right, res);

        return Math.max(left + 1, right + 1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int left  = preorder(root.left);
        int right = preorder(root.right);
        return Math.max(left+right, res);
    }
}
