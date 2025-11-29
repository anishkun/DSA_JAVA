package Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        while (i < n) {
            int a = intervals[i][0];
            int b = intervals[i][1];


            while (i + 1 < n && intervals[i + 1][0] <= b) {
                b = Math.max(b, intervals[i + 1][1]);
                i++;
            }

            list.add(new int[]{a, b});
            i++;
        }

        return list.toArray(new int[list.size()][]);
    }
}
