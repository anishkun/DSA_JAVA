package BackTracking;

public class GenerateParenthisisBT {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String curr, int open, int close, int n) {
        // Base case: valid sequence formed
        if (curr.length() == n * 2) {
            res.add(curr);
            return;
        }

        // Add '(' if we can still open
        if (open < n) {
            backtrack(res, curr + "(", open + 1, close, n);
        }

        // Add ')' if we can close some open ones
        if (close < open) {
            backtrack(res, curr + ")", open, close + 1, n);
        }
    }
}
