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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return diameter;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int lef=solve(root.left);
        int righ=solve(root.right);
        diameter=Math.max(diameter,lef + righ);
        return 1 + Math.max(lef,righ);
    }
}