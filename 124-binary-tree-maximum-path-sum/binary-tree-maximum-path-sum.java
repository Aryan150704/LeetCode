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
    Integer Max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return Max;
    }
    private int max(TreeNode root){
        if(root==null)return 0;
        int l=Math.max(max(root.left),0);
        int r=Math.max(max(root.right),0);
        Max=Math.max(Max,l+r+root.val);
        return Math.max(l+root.val,r+root.val);
    }
}