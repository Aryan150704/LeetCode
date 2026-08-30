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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int height=que.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<height;i++){
                TreeNode curr=que.poll();
                arr.add(curr.val);
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
                }
            }
            ans.add(arr.get(arr.size()-1));
        }
        return ans;
    }
}