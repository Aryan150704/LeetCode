class Solution {
    public int maxProduct(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            if(prefix[i-1]==0){
                prefix[i]=nums[i];
            }
            else
            prefix[i]=prefix[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            if(suffix[i+1]==0){
                suffix[i]=nums[i];
            }
            else
            suffix[i]=suffix[i+1]*nums[i];  
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,Math.max(suffix[i],prefix[i]));
        }
        return max;
    }
}