package Arrays;

public class MinimumPositiveSumSubarray {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int len = l; len <= r && i + len <= n; len++) {
                int sum = prefix[i + len] - prefix[i];
                if (sum > 0 && sum < min) {
                    min = sum;
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
