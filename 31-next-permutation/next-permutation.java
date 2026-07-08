class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        System.out.print(ind);
        if(ind>=0){
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind]){
                    int temp=nums[ind];
                    nums[ind]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        Arrays.sort(nums,ind+1,nums.length);
    }
}