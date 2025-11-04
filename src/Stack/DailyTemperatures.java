package Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>(); // stores indices of unresolved days

        for (int i = 0; i < n; i++) {
            // While current day's temperature is warmer than a previous day
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int prevDay = st.pop();
                res[prevDay] = i - prevDay; // difference in days
            }
            st.push(i); // add current day's index
        }

        // remaining days in stack stay 0 (no warmer future day)
        return res;
    }
}
