package DynamicProgramming;

public class CoinChangeTOPDOWN {
    Integer[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new Integer[amount+1];
        int res = dfs(coins, amount);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int dfs(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if (dp[amount] != null) return dp[amount];

        int best = Integer.MAX_VALUE;

        for (int c : coins) {
            int r = dfs(coins, amount - c);
            if (r != Integer.MAX_VALUE)
                best = Math.min(best, r + 1);
        }

        dp[amount] = best;
        return best;
    }
}
