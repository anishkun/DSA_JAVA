package DynamicProgramming;

public class ClimbingStairsTOPDOWN {
    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n);
    }

    private int helper(int rem) {
        if (rem == 0) return 1;
        if (rem < 0) return 0;
        if (dp[rem] != -1) return dp[rem];

        dp[rem] = helper(rem - 1) + helper(rem - 2);
        return dp[rem];
    }
}
