class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
        int j=0;
        for( i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            for(j=nums.length-1;j>i;j--){
                if(nums[j]>nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        int start=i+1;int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}