package Strings;

public class MinimunWindowSubString {
    static {
        for(int i = 0; i<500;i++){minWindow("","");}
    }
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return "";
        }

        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        char[] chS = s.toCharArray();

        while (end < chS.length) {
            if (map[chS[end++]]-- > 0) {
                count--;
            }

            while (count == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    startIndex = start;
                }
                if (map[chS[start++]]++ >= 0) {
                    count++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : new String(chS, startIndex, minLen);
    }
}
