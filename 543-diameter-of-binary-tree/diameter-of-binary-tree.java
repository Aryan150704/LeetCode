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
    Integer ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        pot(root);
        return ans;
    }
    private int pot(TreeNode root){
        if(root==null)return 0;
        int l=pot(root.left);
        int r=pot(root.right);
        ans=Math.max(ans,l+r);
        return Math.max(l,r)+1;
    }
}