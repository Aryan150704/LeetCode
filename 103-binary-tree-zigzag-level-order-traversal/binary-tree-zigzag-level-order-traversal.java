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
    public void Zigzag(TreeNode root,List<List<Integer>> ans,int level){
        if(root==null){
            return ;
        }
        if(ans.size()==level){
            ans.add(new ArrayList<>());
        }
        if(level%2==0){
            ans.get(level).add(root.val);
        }
        else{
            ans.get(level).add(0,root.val);
        }
        Zigzag(root.left,ans,level+1);
        Zigzag(root.right,ans,level+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        Zigzag(root,ans,0);
        return ans;
    }
}