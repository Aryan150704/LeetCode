class Solution {
    public int maxProduct(int[] nums) {
        int firMax=-1;
        int secMax=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firMax){
                secMax=firMax;
                firMax=nums[i];
                
            }else if(nums[i]>secMax){
                secMax=nums[i];
            }
            
        }
        
        return (firMax-1)*(secMax-1);
    }
}