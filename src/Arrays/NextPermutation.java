package Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: find the pivot (first decreasing element from right)
        int place = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                place = i;
                break;
            }
        }

        // Step 2: if no pivot found, array is highest permutation
        if (place == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: find smallest element in suffix > nums[place]
        int large = -1;
        for (int i = n - 1; i > place; i--) {
            if (nums[i] > nums[place]) {
                large = i;
                break;
            }
        }

        // SAFETY CHECK (should never happen, but prevents crashes)
        if (large == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 4: swap pivot with that element
        swap(nums, place, large);

        // Step 5: reverse the suffix
        reverse(nums, place + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
