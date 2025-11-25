package DynamicProgramming;

public class MinCostClimbingStairsTOPDOWN {
    Integer[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new Integer[cost.length + 1];
        return solve(cost, cost.length);
    }

    private int solve(int[] cost, int i) {
        if (i <= 1) return 0;
        if (dp[i] != null) return dp[i];

        int one = solve(cost, i - 1) + cost[i - 1];
        int two = solve(cost, i - 2) + cost[i - 2];

        return dp[i] = Math.min(one, two);
    }
}
