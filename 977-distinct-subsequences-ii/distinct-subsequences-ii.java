class Solution {
    public int distinctSubseqII(String s) {

        final long MOD = 1000000007L;

        int n = s.length();

        long[] dp = new long[n + 1];

        // Empty subsequence
        dp[0] = 1;

        // Last occurrence of each character
        int[] last = new int[26];

        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {

            int c = s.charAt(i) - 'a';

            // Every old subsequence:
            // 1. don't take current character
            // 2. take current character
            dp[i + 1] = (2 * dp[i]) % MOD;

            // Remove duplicates
            if (last[c] != -1) {
                dp[i + 1] =
                    (dp[i + 1] - dp[last[c]] + MOD) % MOD;
            }

            // Update last occurrence
            last[c] = i;
        }

        // Remove empty subsequence
        return (int)((dp[n] - 1 + MOD) % MOD);
    }
}