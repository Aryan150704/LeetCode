class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n = heights.length, m = queries.length;
        int[] ans = new int[m];
        List<int[]>[] pending = new List[n];
        for (int i = 0; i < n; i++) pending[i] = new ArrayList<>();

        for (int k = 0; k < m; k++) {
            int a = queries[k][0], b = queries[k][1];
            if (a > b) { int t = a; a = b; b = t; }
            if (a == b || heights[a] < heights[b]) ans[k] = b;
            else { ans[k] = -1; pending[b].add(new int[]{heights[a], k}); }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        for (int i = 0; i < n; i++) {
            while (!pq.isEmpty() && pq.peek()[0] < heights[i]) ans[pq.poll()[1]] = i;
            for (int[] q : pending[i]) pq.offer(q);
        }
        return ans;
    }
}