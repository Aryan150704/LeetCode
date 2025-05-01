class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int x : nums) {
            if(max < x) max = x;
        }
        int[] f = new int[max + 1];
        for(int x : nums) {
            f[x]++;
        }
        int ans = 0;
        for(int i = 0; i < max; i++) {
            if(f[i] > 1) {
                f[i+1] += f[i] - 1;
                ans += f[i] - 1;
            }
        }
        ans += (f[max] - 1) * f[max] / 2;
        return ans;
    }
}