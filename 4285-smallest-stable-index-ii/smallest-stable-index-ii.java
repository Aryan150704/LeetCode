class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] suf=new int[n];
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.min(nums[i],suf[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-suf[i]<=k)return i;
        }
        return -1;
    }
}