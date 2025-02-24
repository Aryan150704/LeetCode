class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2)
            len += nums[i];
        int ans[] = new int[len];
        int idx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(ans, idx, idx+ nums[i], nums[i + 1]);
            idx += nums[i];
        }
        return ans;
    }
}