class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(0==ans[nums.length-1]-ans[i]){
                return i;
            }
            
            }
            else if(i==nums.length-1){
                if(ans[i-1]==0){
                return i;
            }
            }
            else{
                if(ans[i-1]==ans[nums.length-1]-ans[i]){
                return i;
            }
            }
            
        }
        return -1;
    }
}