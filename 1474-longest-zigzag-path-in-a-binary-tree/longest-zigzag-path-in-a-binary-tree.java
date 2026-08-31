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
    Integer max=0;
    public int longestZigZag(TreeNode root) {
        bt(root,false,0);
        bt(root,true,0);
        return max;
    }
    public void bt(TreeNode root,boolean left,int len){
        if(root==null)return ;
        max=Math.max(max,len);
        if(left){
            bt(root.left,true,1);
            bt(root.right,false,len+1);
        }
        else{
            bt(root.left,true,len+1);
            bt(root.right,false,1);
        }
        return ;
    }
}