package Stack;

public class LargestRectangleinHistogramStack {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] right = new int[n];
        int[] left = new int[n];

        Arrays.fill(right, n); // Default: no smaller element to the right
        Arrays.fill(left, -1); // Default: no smaller element to the left

        // Next Smaller to Right
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                right[st.pop()] = i;
            }
            st.push(i);
        }

        st.clear();

        // Next Smaller to Left
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                left[st.pop()] = i;
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
