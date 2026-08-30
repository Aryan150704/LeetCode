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
    boolean isSib=false;
    public boolean isCousins(TreeNode root, int x, int y) {
        isSibling(root,x,y);
        return !isSib && level(root,x,1)==level(root,y,1);
    }
    public void isSibling(TreeNode root, int x, int y){
        if(root==null)return ;
        if(root.left!=null && root.right!=null &&
        ((root.left.val==x && root.right.val==y) || (root.left.val==y && root.right.val==x))) isSib=true;
        isSibling(root.left,x,y);
        isSibling(root.right,x,y);
    }
    public int level(TreeNode root,int x,int d){
        if(root==null)return -1;
        if(root.val==x)return d;
        int l=level(root.left,x,d+1);
        if(l!=-1)return l;
        return level(root.right,x,d+1);
    }
}