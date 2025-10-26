package Strings;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {


        int n = s.length();
        int max = 0;
        int left = 0;
        int[] index = new int[128];

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(left, index[c]);
            max = Math.max(max, right - left + 1);
            index[c] = right + 1;
        }

        return max;



    }
}
