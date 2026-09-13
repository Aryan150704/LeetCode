class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<int[]> a = new ArrayList<>(), b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (img1[i][j] == 1) a.add(new int[]{i, j});
                if (img2[i][j] == 1) b.add(new int[]{i, j});
            }
        }

        int[] count = new int[(2 * n - 1) * (2 * n - 1)];
        int width = 2 * n - 1, res = 0;
        for (int[] p : a) {
            for (int[] q : b) {
                int dr = p[0] - q[0] + n - 1;
                int dc = p[1] - q[1] + n - 1;
                res = Math.max(res, ++count[dr * width + dc]);
            }
        }
        return res;
    }
}