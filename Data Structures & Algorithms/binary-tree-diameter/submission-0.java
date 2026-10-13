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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterBS(root);
        return max;
    }
    public int diameterBS(TreeNode root){
        if (root == null) return 0;

        int left = diameterBS(root.left);
        int right = diameterBS(root.right);

        max = Math.max(max,left + right);
        return Math.max(left,right)+1;
    }
}
