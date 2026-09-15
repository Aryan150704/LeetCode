class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length(), start = 0, res = 0;
        for (int i = 0; i < n; i++) {
            for (int len = k; len <= k + 1; len++) {
                int l = i - len + 1;
                if (l >= start && isPal(s, l, i)) {
                    res++;
                    start = i + 1;
                    break;
                }
            }
        }
        return res;
    }

    private boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}