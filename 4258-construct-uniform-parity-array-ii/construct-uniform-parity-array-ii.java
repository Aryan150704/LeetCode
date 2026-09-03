class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;

        for (int num : nums1) {
            min = Math.min(min, num);
        }

        for (int num : nums1) {
            if (num % 2 != min % 2) {
                if (min % 2 == 0) return false;
            }
        }

        return true;
    }
}