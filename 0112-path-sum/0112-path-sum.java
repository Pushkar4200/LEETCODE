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
    public boolean hasPathSum(TreeNode root, int B) {
        if(root==null){
            return false;
        }
        if(root.left == null && root.right == null){
            return (B==root.val);
        }
        return hasPathSum(root.left,B-root.val) || hasPathSum(root.right,B-root.val);
    }
}