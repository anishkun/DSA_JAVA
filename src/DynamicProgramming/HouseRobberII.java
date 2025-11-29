package DynamicProgramming;

public class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int first = helper(nums, 0, n - 2); // rob 0 to n-2
        int second = helper(nums, 1, n - 1); // rob 1 to n-1

        return Math.max(first, second);
    }

    int helper(int[] nums, int start, int end) {
        int prev1 = 0;  // dp[i-1]
        int prev2 = 0;  // dp[i-2]

        for (int i = start; i <= end; i++) {
            int take = nums[i] + prev2;
            int skip = prev1;
            int curr = Math.max(take, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
