package Stack;

public class ValidParenthisis {
    static char pair[] = new char[128];

    static {
        pair[(int)')'] = '(';
        pair[(int)'}'] = '{';
        pair[(int)']'] = '[';

        pair[(int)'('] = 'q';
        pair[(int)'{'] = 'q';
        pair[(int)'['] = 'q';

        for (int i = 0; i < 300; ++i) {
            isValid("");
        }
    }

    public static boolean isValid(String s) {
        int length = s.length();
        char stack[] = new char[length / 2 + 1];
        int top = 0;

        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            char p = pair[c];
            if (p == 'q') {
                stack[top++] = c;
            } else if (top == 0) {
                return false;
            } else if (stack[--top] != p) {
                return false;
            }

            if (top > (length - i - 1)) {
                return false;
            }
        }

        return top == 0;
    }
}
