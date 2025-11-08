package BinarySearch;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            // If mid element is greater than element at high, min is to the right.
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else { // otherwise min is at mid or to the left
                high = mid;
            }
        }
        return nums[low];
    }
}
