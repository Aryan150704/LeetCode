class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=l+(r-l)/2;
        while(l<=r){
            mid=l+(r-l)/2;
            if(l==r){
                return nums[mid];
            }
            if(nums[mid+1]!=nums[mid] && nums[mid-1]!=nums[mid]){
                return nums[mid];
            }
            else if(nums[mid-1]==nums[mid]){
                if(mid%2==0){
                    r=mid-2;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if((mid+1)%2==0){
                    r=mid-1;
                }
                else{
                    l=mid+2;
                }
            }
        }
        return -1;
    }
}