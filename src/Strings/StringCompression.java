package Strings;

public class StringCompression {
    public static
    int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int read = 0;

        while (read < n) {
            char current = chars[read];
            int count = 0;


            while (read < n && chars[read] == current) {
                read++;
                count++;
            }


            chars[write++] = current;


            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
