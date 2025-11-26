package DynamicProgramming;

public class CoinChangeIITOPDOWN {
    Integer[][] dp;

    public int change(int amount, int[] coins) {
        dp = new Integer[coins.length][amount + 1];
        return helper(0, amount, coins);
    }

    int helper(int idx, int amount, int[] coins) {
        if (amount == 0) return 1;
        if (idx == coins.length || amount < 0) return 0;

        if (dp[idx][amount] != null) return dp[idx][amount];

        // Choice 1: take current coin (unlimited)
        int take = helper(idx, amount - coins[idx], coins);

        // Choice 2: skip coin
        int skip = helper(idx + 1, amount, coins);

        return dp[idx][amount] = take + skip;
    }gg
}
