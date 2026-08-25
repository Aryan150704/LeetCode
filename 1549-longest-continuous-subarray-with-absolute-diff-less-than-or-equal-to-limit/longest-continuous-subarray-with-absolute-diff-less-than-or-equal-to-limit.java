class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDq = new ArrayDeque<>();
        Deque<Integer> minDq = new ArrayDeque<>();
        int left = 0, ans = 0;
        for (int right = 0; right < nums.length; right++) {
            while (!maxDq.isEmpty() && nums[maxDq.peekLast()] <= nums[right]) maxDq.pollLast();
            maxDq.offerLast(right);
            while (!minDq.isEmpty() && nums[minDq.peekLast()] >= nums[right]) minDq.pollLast();
            minDq.offerLast(right);
            while (nums[maxDq.peekFirst()] - nums[minDq.peekFirst()] > limit) {
                if (maxDq.peekFirst() == left) maxDq.pollFirst();
                if (minDq.peekFirst() == left) minDq.pollFirst();
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}