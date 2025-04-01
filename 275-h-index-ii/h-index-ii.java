    class Solution {
        public int hIndex(int[] citations) {
            return solve(citations);
        }

    private int solve(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n;

        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] + m >= n)
                r = m;
            else
                l = m + 1;
        }

        return n - l;
    }
}