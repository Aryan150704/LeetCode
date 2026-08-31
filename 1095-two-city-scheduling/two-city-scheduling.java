class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (x, y) -> (x[0] - x[1]) - (y[0] - y[1]));
        int n = costs.length / 2, total = 0;
        for (int i = 0; i < n; i++) total += costs[i][0];
        for (int i = n; i < costs.length; i++) total += costs[i][1];
        return total;
    }
}