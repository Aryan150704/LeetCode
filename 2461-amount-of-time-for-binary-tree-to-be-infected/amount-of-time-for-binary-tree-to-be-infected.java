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
    private int max = 0;

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start);
        return max;
    }

    private int dfs(TreeNode root, int start) {
        if (root == null) return 0;
        int l = dfs(root.left, start);
        int r = dfs(root.right, start);
        if (root.val == start) {
            max = Math.max(max, Math.max(l, r));
            return -1;
        }
        if (l >= 0 && r >= 0) return Math.max(l, r) + 1;
        max = Math.max(max, Math.abs(l) + Math.abs(r));
        return (l < 0 ? l : r) - 1;
    }
}