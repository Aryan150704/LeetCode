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
    int totalCount=0;
    public int averageOfSubtree(TreeNode root) {
        cal(root);
        return totalCount;
    }
    public int[] cal(TreeNode root){
        if(root==null)return new int[] {0,0};
        int l[]=cal(root.left);
        int r[]=cal(root.right);
        int total=l[0]+r[0]+root.val;
        int level=l[1]+r[1]+1;
        if(total/level==root.val)totalCount++;
        return new int[]{total,level};
    }
}