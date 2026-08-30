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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)return arr;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int k=0;
        while(!que.isEmpty()){
            List<Integer> arrCurr=new ArrayList<>();
            int height=que.size();
            for(int i=0;i<height;i++){
                TreeNode curr=que.poll();
                arrCurr.add(curr.val);
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
                }
            }
            if(k%2==0){
                arr.add(arrCurr);
            }
            else{
                Collections.reverse(arrCurr);
                arr.add(arrCurr);
            }
            k++;
        }
        return arr;
    }
}