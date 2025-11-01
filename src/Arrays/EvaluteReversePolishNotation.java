package Arrays;

public class EvaluteReversePolishNotation {
    int i;

    public int evalRPN(String[] tokens) {
        i = tokens.length;
        return eval(tokens);
    }

    public int eval(String[] tokens) {
        String currentString = tokens[--i];
        int k = 0, sign = 1, num = 0;
        char s = currentString.charAt(0);
        if (currentString.length() == 1) {
            switch (s) {
                case '+':
                    return eval(tokens) + eval(tokens);
                case '-':
                    return -eval(tokens) + eval(tokens);
                case '*':
                    return eval(tokens) * eval(tokens);
                case '/':
                    int second = eval(tokens);
                    int first = eval(tokens);
                    return first / second;
                default:
                    return s - '0';
            }
        } else {
            if (s == '-') {
                sign = -1;
                s = currentString.charAt(++k);
            }
            while (k < currentString.length()) {
                s = currentString.charAt(k++);
                num = num * 10 + s - '0';
            }
            return num * sign;
        }
    }
}
