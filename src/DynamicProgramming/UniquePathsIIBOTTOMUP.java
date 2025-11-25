package DynamicProgramming;

public class UniquePathsIIBOTTOMUP {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];


        if (grid[0][0] == 1) return 0;

        dp[0][0] = 1;


        for (int i = 1; i < m; i++) {
            if (grid[i][0] == 1) break;
            dp[i][0] = 1;
        }


        for (int j = 1; j < n; j++) {
            if (grid[0][j] == 1) break;
            dp[0][j] = 1;
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
