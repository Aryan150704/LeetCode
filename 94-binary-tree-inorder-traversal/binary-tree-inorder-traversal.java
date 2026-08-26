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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<Integer>();
        iot(ls,root);
        return ls;
    }
    public void iot(List<Integer> ls,TreeNode root){
        if(root==null)return ;
        iot(ls,root.left);
        ls.add(root.val);
        iot(ls,root.right);
    }
}