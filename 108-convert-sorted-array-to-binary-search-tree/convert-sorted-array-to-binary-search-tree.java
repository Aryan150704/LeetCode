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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bsti(nums,0,nums.length-1);
    }
    public TreeNode bsti(int[] nums, int lo ,int hi){
        if(lo>hi)return null;
        int mid=lo +(hi-lo)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=bsti(nums,lo,mid-1);
        root.right=bsti(nums,mid+1,hi);
        return root;
    }
}