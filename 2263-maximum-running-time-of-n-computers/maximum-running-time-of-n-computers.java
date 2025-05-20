class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) sum += b;

        long low = 0, high = sum / n, ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(batteries, mid, n)) {
                ans = mid;
                low = mid + 1; // try for longer time
            } else {
                high = mid - 1; // try for shorter time
            }
        }

        return ans;
    }

    private boolean isPossible(int[] batteries, long time, int n) {
        long total = 0;
        for (int b : batteries) {
            total += Math.min((long) b, time);
        }
        return total >= time * n;
    }
}