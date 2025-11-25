package DynamicProgramming;

public class UniquePathsIITOPDOWN {
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(obstacleGrid, 0, 0);
    }

    int helper(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;

        if (i >= m || j >= n) return 0;
        if (grid[i][j] == 1) return 0;
        if (i == m - 1 && j == n - 1) return 1;

        if (dp[i][j] != -1) return dp[i][j];

        int right = helper(grid, i, j + 1);
        int down = helper(grid, i + 1, j);

        return dp[i][j] = right + down;
    }
}
