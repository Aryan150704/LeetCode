class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int f=hr(nums,0,nums.length-2);
        int l=hr(nums,1,nums.length-1);
        return Math.max(f,l);
        
    }
    private int hr(int[] nums,int s,int n){
        if(n==s)return nums[s];
        if(n==s+1)return Math.max(nums[s],nums[s+1]);
        int curr=Math.max(nums[s],nums[s+1]);
        int prev=nums[s];
        for(int i=s+2;i<=n;i++){
            int max=Math.max(curr,prev+nums[i]);
            prev=curr;
            curr=max;
        }
        return curr;
    }
}