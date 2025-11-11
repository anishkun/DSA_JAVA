package Strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first word as a prefix candidate
        String prefix = strs[0];

        // Compare with all other strings
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with the prefix,
            // shorten the prefix by removing the last character.
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
