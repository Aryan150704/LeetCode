class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        int maxFreq=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
            maxFreq=Math.max(maxFreq,arr[nums[i]]);
        }
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==maxFreq) ans++;
        }
        return ans;
    }
}