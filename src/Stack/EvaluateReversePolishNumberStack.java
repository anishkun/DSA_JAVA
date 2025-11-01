package Stack;
import java.util.*;
public class EvaluateReversePolishNumberStack {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            // if it's an operator
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                switch (s) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break; // integer division
                }
            }
            // otherwise, it's a number
            else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}
