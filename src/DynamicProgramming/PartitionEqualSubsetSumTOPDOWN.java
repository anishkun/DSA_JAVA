package DynamicProgramming;

public class PartitionEqualSubsetSumTOPDOWN {
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;

        // if sum is odd → cannot partition
        if (sum % 2 != 0) return false;

        int target = sum / 2;

        dp = new Boolean[nums.length][target + 1];

        return solve(nums, 0, target);
    }

    // Can we make target using nums[i ... end] ?
    boolean solve(int[] nums, int i, int target) {

        // target formed ✔
        if (target == 0) return true;

        // no numbers left but still target remaining ✖
        if (i == nums.length || target < 0) return false;

        // memo check
        if (dp[i][target] != null) return dp[i][target];

        // CHOICE:
        // include nums[i] or exclude nums[i]
        boolean include = solve(nums, i + 1, target - nums[i]);
        boolean exclude = solve(nums, i + 1, target);

        return dp[i][target] = include || exclude;
    }
}
