class Solution {
    public int longestWPI(int[] hours) {
        Map<Integer, Integer> seen = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < hours.length; i++) {
            sum += hours[i] > 8 ? 1 : -1;

            if (sum > 0) {
                ans = i + 1;  // whole prefix is valid
            } else {
                // find earliest index where prefix = sum-1
                if (seen.containsKey(sum - 1)) {
                    ans = Math.max(ans, i - seen.get(sum - 1));
                }
            }

            // only store first occurrence
            if (!seen.containsKey(sum)) {
                seen.put(sum, i);
            }
        }

        return ans;
    }
}