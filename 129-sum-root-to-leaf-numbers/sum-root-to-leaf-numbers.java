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
    Integer totalSum=0;
    public int sumNumbers(TreeNode root) {
        sum(root,0);
        return totalSum;
    }
    public void sum(TreeNode root,int currentSum){
        if(root==null)return ;
        if(root.left==null && root.right==null){
            totalSum+=currentSum*10+root.val;
        }
        currentSum=currentSum*10+root.val;
        sum(root.left,currentSum);
        sum(root.right,currentSum);
    }
}