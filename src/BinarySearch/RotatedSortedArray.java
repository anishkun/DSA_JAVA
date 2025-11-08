package BinarySearch;

public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            // Check which half is sorted
            if (nums[low] <= nums[mid]) {  // left half sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // target in left half
                } else {
                    low = mid + 1;   // target in right half
                }
            } else { // right half sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;   // target in right half
                } else {
                    high = mid - 1;  // target in left half
                }
            }
        }

        return -1;
    }
}
