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
    Integer ans=-1;
    Integer count=0;
    public int kthSmallest(TreeNode root, int k) {
        iot(0,k,root);
        return ans;
    }
    private void iot(int m,int k,TreeNode root){
        if(root==null){
            return ;
        }
        iot(m,k,root.left);
        count++;
        if(count==k){ ans=root.val;return ;}
        iot(m,k,root.right);
    }
}