class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int idx=0; idx<nums.length; ++idx) {
            if (pairs.containsKey(target - nums[idx])) {
                return new int[] { pairs.get(target - nums[idx]), idx };
            }
            pairs.put(nums[idx], idx);
        }
        return null;
    }
}