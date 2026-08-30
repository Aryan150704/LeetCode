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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pt(root,targetSum,0);
    }
    public boolean pt(TreeNode root, int targetSum,int currSum){
        if (root==null)return false;
        currSum+=root.val;
        if(root.left==null && root.right==null)return currSum==targetSum;
        return pt(root.left,targetSum,currSum) || pt(root.right,targetSum,currSum);
    }
}