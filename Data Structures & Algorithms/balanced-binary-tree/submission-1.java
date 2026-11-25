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
    private int preorder(TreeNode root){
        if(root == null) return 0;
        int left  = preorder(root.left);
        int right = preorder(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right ) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true;

        int left  = preorder(root.left);
        int right = preorder(root.right);
        if(left == -1 || right == -1){
            return false;
        }
        return Math.abs(left - right ) < 2;

    }
}
