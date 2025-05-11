class Solution {
    public boolean itis(int mid,int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=mid) count++;
        }
        return count==mid;
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(itis(mid,nums)){
                return mid;
            }
            else {
                int count = 0;
                for (int num : nums) {
                    if (num >= mid) count++;
                }
                if (count > mid) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}