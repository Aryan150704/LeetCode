class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            prefix[i]=product;
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            product*=nums[i];
            suffix[i]=product;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=suffix[i+1];
            }
            else if(i==nums.length-1){
            ans[i]=prefix[i-1];
            }
            else{
                ans[i]=prefix[i-1]*suffix[i+1];
            }
        }
        return ans;
    }
}