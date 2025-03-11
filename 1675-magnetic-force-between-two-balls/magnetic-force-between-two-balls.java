class Solution {
    public int maxDistance(int[] stalls, int k) {
        Arrays.sort(stalls);
        int l = 1;
        int r = stalls[stalls.length - 1] - stalls[0];
        int res = 0;

        while (l <= r) {
            int m = (l + r) / 2;
            if (check(stalls, m, k)) {
                res = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return res;
    }

    public static boolean check(int[] stalls, int m, int k) {
        int count = 1;
        int lastp = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastp >= m) {
                count++;
                lastp = stalls[i];
            }
        }

        return count >= k;
    }
} 
   