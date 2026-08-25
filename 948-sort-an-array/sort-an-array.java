class Solution {
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        int[] count = new int[max - min + 1];
        for (int x : nums) count[x - min]++;
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) nums[k++] = i + min;
        }
        return nums;
    }
}