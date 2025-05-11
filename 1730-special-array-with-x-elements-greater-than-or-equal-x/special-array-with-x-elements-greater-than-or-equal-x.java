class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n;
        while(start<=end){
            int mid=(start+end)/2;
            int cnt=0;
            for(int i=0;i<n;i++){
                if(nums[i]>=mid) cnt++;
            }
            if(mid==cnt) return mid;
            if(mid>cnt){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
}