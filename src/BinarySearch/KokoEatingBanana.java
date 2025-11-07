package BinarySearch;

public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();

        while (left < right) {
            int mid = (left + right) / 2;
            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k; // ceil(p/k)
        }
        return hours <= h;
    }
}
