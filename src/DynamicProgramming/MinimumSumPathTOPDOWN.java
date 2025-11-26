package DynamicProgramming;

public class MinimumSumPathTOPDOWN {
    int dp[][];

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        dp = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(dp[i], -1);
        return helper(grid, 0, 0);
    }

    int helper(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;

        if (i >= m || j >= n) return Integer.MAX_VALUE; // sentinel
        if (i == m - 1 && j == n - 1) return grid[i][j];
        if (dp[i][j] != -1) return dp[i][j];

        int right = helper(grid, i, j + 1);
        int down = helper(grid, i + 1, j);

        int best = Math.min(right, down);
        // if both are sentinel, no path (shouldn't happen in valid input),
        // return sentinel; else add current cell safely
        dp[i][j] = (best == Integer.MAX_VALUE) ? Integer.MAX_VALUE : grid[i][j] + best;
        return dp[i][j];
    }
}
