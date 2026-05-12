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
    public boolean hasPathSum(TreeNode root, int q) {
        if(root==null) return false;
        if(root.left==null && root.right==null){
          return (q==root.val);
        }
    return (hasPathSum(root.left,q-root.val) || hasPathSum(root.right,q-root.val));
    }
}