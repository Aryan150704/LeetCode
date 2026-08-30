/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode rank=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ss(root,p,q);
        return rank;
    }
    public boolean ss(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)return false;
        boolean self=root==p || root==q;
        boolean l=ss(root.left,p,q);
        boolean r=ss(root.right,p,q);
        if(rank==null){
            if((l && r) || (self && (l || r)) )rank=root;
        }
        return l || r || self;
    }
}