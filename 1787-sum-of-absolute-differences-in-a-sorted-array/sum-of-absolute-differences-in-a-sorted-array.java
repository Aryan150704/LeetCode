class Solution {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
         int n = nums.length;
        int totalSum = 0;
        for ( int num : nums) totalSum += num;
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            totalSum -= cur;
            nums[i] = Math.abs(prefixSum - (i*cur)) + 
                      Math.abs(totalSum - ((n-i-1)*cur));
            prefixSum += cur;
        }
        return nums;
    }
}